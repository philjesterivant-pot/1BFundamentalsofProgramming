import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Assignment4Buffer {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter height (cm): ");
        double height = Double.parseDouble(br.readLine());

        System.out.print("Enter age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.print("Enter citizenship code (C = citizen of Endor, N = non-citizen): ");
        String citizen = br.readLine().trim();

        System.out.print("Enter recommendee code (R = recommendee, N = non-recommendee): ");
        String recommendee = br.readLine().trim();

        if (recommendee.equalsIgnoreCase("R")) {
            System.out.println("Result: ACCEPTED (recommended by Jedi Master Obi Wan)");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizen.equalsIgnoreCase("C")) {
            System.out.println("Result: ACCEPTED");
        } else {
            System.out.println("Result: REJECTED");
        }
    }
}
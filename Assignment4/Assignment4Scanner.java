import java.util.Scanner;

public class Assignment4Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter citizenship code (C = citizen of Endor, N = non-citizen): ");
        String citizen = sc.next();

        System.out.print("Enter recommendee code (R = recommendee, N = non-recommendee): ");
        String recommendee = sc.next();

        if (recommendee.equalsIgnoreCase("R")) {
            System.out.println("Result: ACCEPTED (recommended by Jedi Master Obi Wan)");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizen.equalsIgnoreCase("C")) {
            System.out.println("Result: ACCEPTED");
        } else {
            System.out.println("Result: REJECTED");
        }
    }
}
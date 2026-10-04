import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Assignment3Buffer {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter NSAT score: ");
        double nsat = Double.parseDouble(br.readLine());

        System.out.print("Enter parents' monthly salary: ");
        double salary = Double.parseDouble(br.readLine());

        System.out.print("Enter entrance exam score: ");
        double exam = Double.parseDouble(br.readLine());

        double average = (nsat + exam) / 2;

        if (salary > 10000 || nsat < 90 || exam < 85) {
            System.out.println("Result: REJECTED");
        } else if (salary <= 3500 && average >= 91) {
            System.out.println("Result: ACCEPTED");
        } else {
            System.out.println("Result: FOR FURTHER STUDY");
        }
    }
}

import java.util.Scanner;

public class Assignment3Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter NSAT score: ");
        double nsat = sc.nextDouble();

        System.out.print("Enter parents' monthly salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter entrance exam score: ");
        double exam = sc.nextDouble();

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

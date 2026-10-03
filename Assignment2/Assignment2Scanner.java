import java.util.Scanner;

public class Assignment2Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hourly pay rate (Php): ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter numbers only.");
            return;
        }
        double rate = sc.nextDouble();

        System.out.print("Enter hours worked: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter numbers only.");
            return;
        }
        double hours = sc.nextDouble();

        if (rate < 0 || hours < 0) {
            System.out.println("Rate and hours cannot be negative.");
            return;
        }

        double grossPay = hours * rate;
        double taxPercent;

        if (grossPay <= 2000) {
            taxPercent = 10;
        } else if (grossPay <= 4000) {
            taxPercent = 12;
        } else if (grossPay <= 10000) {
            taxPercent = 15;
        } else {
            taxPercent = 20;
        }

        double tax = grossPay * (taxPercent / 100);
        double netPay = grossPay - tax;

        System.out.println("\n----- PAYSLIP -----");
        System.out.printf("Gross Pay      : Php %.2f%n", grossPay);
        System.out.printf("Withholding Tax: Php %.2f (%.0f%%)%n", tax, taxPercent);
        System.out.printf("Net Pay        : Php %.2f%n", netPay);
        sc.close();
    }
}

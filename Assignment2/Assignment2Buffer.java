import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment2Buffer {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter hourly pay rate (Php): ");
            double rate = Double.parseDouble(br.readLine().trim());

            System.out.print("Enter hours worked: ");
            double hours = Double.parseDouble(br.readLine().trim());

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
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numbers only.");
        } catch (IOException e) {
            System.out.println("Error reading input.");
        }
    }
}

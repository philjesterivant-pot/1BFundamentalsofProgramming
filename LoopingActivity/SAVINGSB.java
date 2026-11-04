import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SAVINGSB {
    public static void main(String [] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter amounts");

        double balance = 20000.00;

        System.out.println("Initial balance: P" + balance);
        System.out.println("Enter amounts (positive = deposit, negative = withdrawal, 0 = stop).");

        System.out.print("Enter amount: ");
        double amount = Double.parseDouble(input.readLine());

        while (amount != 0) {

            if (amount > 0) {
                balance = balance + amount;
                System.out.println("Deposit Successful!");
            } else {
                if (balance >= Math.abs(amount)) {
                    balance = balance + amount;
                    System.out.println("Withdrawal Successful!");
                } else {
                    System.out.println("INSUFFICIENT FUNDS!");
                }
            }
            System.out.printf("Outstanding Balance: %.2f%n", balance);

            System.out.print("Enter amount (0 to stop): ");
            amount = Double.parseDouble(input.readLine());
        }

        System.out.printf("%nFinal Balance: %.2f%n", balance);
    }
}

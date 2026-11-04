import javax.swing.*;

public class SAVINGSJ {
    public static void main(String[] args) {

        double balance = 20000.00;
        double amount;

        JOptionPane.showMessageDialog(null, "Initial Balance: P" + balance);
        amount = Double.parseDouble(
                JOptionPane.showInputDialog("Enter amount:"));

        while (amount != 0) {
            if (amount > 0) {
                balance = balance + amount;

                JOptionPane.showMessageDialog(null, "Deposit Successful!");
            }
            else {
                if (balance >= Math.abs(amount)) {
                    balance = balance + amount;

                    JOptionPane.showMessageDialog(null, "Withdrawal Successful!");
                }
                else {
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
                }
            }
            JOptionPane.showMessageDialog(null, String.format("Outstanding Balance: P%.2f%n", balance));
            amount = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter amount (0 to stop):"));
        }
        JOptionPane.showMessageDialog(null,
                String.format("Final Balance: P%.2f%n", balance));
    }
}

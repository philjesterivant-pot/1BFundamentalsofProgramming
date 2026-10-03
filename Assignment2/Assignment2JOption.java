import javax.swing.*;

public class Assignment2JOption {
    public static void main(String[] args) {
        try {
            String rateInput = JOptionPane.showInputDialog(null,
                    "Enter hourly pay rate (Php):", "Payroll", JOptionPane.QUESTION_MESSAGE);
            if (rateInput == null) return; // Cancel

            String hoursInput = JOptionPane.showInputDialog(null,
                    "Enter hours worked:", "Payroll", JOptionPane.QUESTION_MESSAGE);
            if (hoursInput == null) return; // Cancel

            double rate = Double.parseDouble(rateInput.trim());
            double hours = Double.parseDouble(hoursInput.trim());

            if (rate < 0 || hours < 0) {
                JOptionPane.showMessageDialog(null, "Rate and hours cannot be negative.",
                        "Error", JOptionPane.ERROR_MESSAGE);
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

            String message = String.format(
                    "Gross Pay      : Php %.2f%nWithholding Tax: Php %.2f (%.0f%%)%nNet Pay        : Php %.2f",
                    grossPay, tax, taxPercent, netPay);
            JOptionPane.showMessageDialog(null, message, "Payslip",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter numbers only.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

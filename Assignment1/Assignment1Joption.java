import javax.swing.*;

public class Assignment1Joption {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a year:",
                "Leap Year Checker", JOptionPane.QUESTION_MESSAGE);

        if (input == null) {
            return; // user pressed Cancel
        }

        try {
            int year = Integer.parseInt(input.trim());
            String result;

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                result = year + " is a leap year.";
            } else {
                result = year + " is not a leap year.";
            }
            JOptionPane.showMessageDialog(null, result,
                    "Result", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input. Please enter a valid year (numbers only).",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

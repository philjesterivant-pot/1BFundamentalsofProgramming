import javax.swing.*;

public class Assignment3Joption {
    public static void main(String[] args) {
        double nsat = Double.parseDouble(JOptionPane.showInputDialog("Enter NSAT score:"));
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter parents' monthly salary:"));
        double exam = Double.parseDouble(JOptionPane.showInputDialog("Enter entrance exam score:"));

        double average = (nsat + exam) / 2;
        String result;

        if (salary > 10000 || nsat < 90 || exam < 85) {
            result = "REJECTED";
        } else if (salary <= 3500 && average >= 91) {
            result = "ACCEPTED";
        } else {
            result = "FOR FURTHER STUDY";
        }

        JOptionPane.showMessageDialog(null, "Result: " + result);
    }
}
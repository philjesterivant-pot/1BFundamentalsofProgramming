import javax.swing.*;

public class Assignment4JOption {
    public static void main(String[] args) {
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height (cm):"));
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
        String citizen = JOptionPane.showInputDialog("Enter citizenship code (C = citizen of Endor, N = non-citizen):").trim();
        String recommendee = JOptionPane.showInputDialog("Enter recommendee code (R = recommendee, N = non-recommendee):").trim();

        String result;

        if (recommendee.equalsIgnoreCase("R")) {
            result = "ACCEPTED (recommended by Jedi Master Obi Wan)";
        } else if (height >= 200 && age >= 21 && age <= 25 && citizen.equalsIgnoreCase("C")) {
            result = "ACCEPTED";
        } else {
            result = "REJECTED";
        }
        JOptionPane.showMessageDialog(null, "Result: " + result);
    }
}
import javax.swing.*;

public class EVENNUMBERJ {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();

        for (int x = 2; x <= 100; x += 2) {
            output.append(x).append(" ");
            if (x % 20 == 0) {
                output.append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }
}

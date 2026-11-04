import javax.swing.*;
import java.util.Scanner;

public class HIGHESTNUMBERJ {
    public static void main(String [] args){

        double first = Double.parseDouble(
                JOptionPane.showInputDialog("Enter number 1:"));
        double highest = first;
        double lowest = first;

        for (int x = 2; x <= 10; x++) {
            double num = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter number " + x + ":"));

            if (num > highest) {
                highest = num;
            }
            if (num < lowest) {
                lowest = num;
            }
        }
        JOptionPane.showMessageDialog(null,
                "Highest number: " + highest + "\nLowest number: " + lowest);
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HIGHESTNUMBERB {
    public static void main(String [] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number 1: ");
        double first = Double.parseDouble(input.readLine());
        double highest = first;
        double lowest = first;

        for (int x = 2; x <= 10; x++) {
            System.out.print("Enter number " + x + ": ");
            double num = Double.parseDouble(input.readLine());

            if (num > highest) {
                highest = num;
            }
            if (num < lowest) {
                lowest = num;
            }
        }
        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);
    }
}

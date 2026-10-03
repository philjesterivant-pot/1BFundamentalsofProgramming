import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment1Buffer {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a year: ");
            int year = Integer.parseInt(br.readLine().trim());

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid year (numbers only).");
        } catch (IOException e) {
            System.out.println("Error reading input.");
        }
    }
}

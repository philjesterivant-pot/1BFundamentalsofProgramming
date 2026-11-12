import java.util.Arrays; // import natin tung arrays para magamit ung Arrays. deepToString.

public class PROBLEM1 {
    public static void main(String[] args) {

        // Ilalagay dito yung mga pangalan ng mga taong nakaupo sa cinema.
        String[][] seats = {
                {"Alice", "Bob", "Charlie"},
                {"David", "Emma", "Frank"}
        };

        // Dito natin kukunin yung pangalan sa second row at third column, which is si Frank.
        System.out.println("Second row, third column: " + seats[1][2]);

        // Papalitan si Bob ng vacant.
        seats[0][1] = "Vacant";

        // Dito mag pprint na then ipapakita na yung buong seating arrangement sa isang line.
        System.out.println("Updated Seating Arrangement: " + Arrays.deepToString(seats));
    }
}

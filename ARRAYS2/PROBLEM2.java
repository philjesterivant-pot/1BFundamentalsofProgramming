public class PROBLEM2 {
    public static void main(String[] args) {

        /* Dto nag declare tayo ng double array na temperatures na kayang mag-store ng 5 temperatures.
        And also gumamit ng double data type kasi may mga decimal ang value ng mga temperature natin. */

        double[] temperatures = new double[5];

        // Dito natin ilalagay yung temperature para sa bawat araw gamit ang kanilang index.
        temperatures[0] = 32.5;
        temperatures[1] = 34.0;
        temperatures[2] = 31.8;
        temperatures[3] = 33.2;
        temperatures[4] = 35.1;

        // Gumamit tayo ng for loop para makita lahat ng temperatures sa limang araw.
        // Yung "temperatures.length naman", siya ung nagsasabi kung ilang elements ang laman ng array.
        for (int i = 0; i < temperatures.length; i++) {

            // Ipprint natin dto yung temperature ng bawat araw.
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]);
        }

        // Papalitan natin yung temperature sa third day mula 31.8 into 32.0.
        temperatures[2] = 32.0;

        // So mag pprint na dito then ipapakita na yung bagong temperature sa third day.
        System.out.println("Updated temperature for Day 3: " + temperatures[2]);
    }
}

public class CoffeeShopAnalyzerWithBonus {
    public static void main(String[] args) {

        // Maglalagay or mag initiate ng value sa mga arrays
        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195};
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Ipprint ung daily sales
        System.out.println("--- Daily Sales ---");
        for (int i = 0; i < weeklySales.length; i++) {
            // Using the parallel array to print the actual day name
            System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]);
        }
        // Total and average
        int totalSales = 0;
        for (int dailySale : weeklySales) {
            totalSales += dailySale;
        }
        // Nilagyan natin ng "double" para hindi mawala yung decimal
        double averageSales = (double) totalSales / weeklySales.length;

        System.out.println("\n--- Weekly Summary ---");
        System.out.println("Total Sales: " + totalSales + " cups");
        System.out.println("Average Daily Sales: " + averageSales + " cups");

        // Hanapin natin kung alin ang pinaka mataas at pinaka mababang sales
        int maxSales = weeklySales[0];
        int minSales = weeklySales[0];
        String bestDay = daysOfWeek[0];
        String worstDay = daysOfWeek[0];

        // Start sa index 1 kasi nagamit na natin yung unang value
        for (int i = 1; i < weeklySales.length; i++) {
            // Check ang bagong highest or maximum sales
            if (weeklySales[i] > maxSales) {
                maxSales = weeklySales[i];
                bestDay = daysOfWeek[i];
            }
            // Check ang bagong lowest or the minimum sales
            if (weeklySales[i] < minSales) {
                minSales = weeklySales[i];
                worstDay = daysOfWeek[i];
            }
        }
        // Ipprint na lahat dto para lumabas na ang output
        System.out.println("\n--- Bests and Worsts ---");
        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups.");
        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups.");
    }
}

import java.util.Scanner;

public class ForexExchangeSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] currencies = {"USD", "EUR", "JPY", "GBP", "AUD"};
        double[][] rates = new double[5][5];
        System.out.println("=== FOREX EXCHANGE INPUT SYSTEM ===");

    
        for (int i = 0; i < currencies.length; i++) {
            System.out.println("\nEnter rates for " + currencies[i] + ":");
            for (int day = 0; day < 5; day++) {
                System.out.print("Rate on Day " + (day + 1) + ": ");
                rates[i][day] = sc.nextDouble();
            }
        }

        
        System.out.println("\n\n=================== FOREX SUMMARY (Day 1 - Day 5) ===================");
        System.out.println("Currency | Day1 | Day2 | Day3 | Day4 | Day5 | Peak | Lowest");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < currencies.length; i++) {

            double peak = rates[i][0];
            double low = rates[i][0];

            for (int d = 1; d < 5; d++) {
                if (rates[i][d] > peak) peak = rates[i][d];
                if (rates[i][d] < low) low = rates[i][d];
            }

            System.out.printf("%-8s | %.2f | %.2f | %.2f | %.2f | %.2f | %.2f | %.2f\n",
                    currencies[i],
                    rates[i][0], rates[i][1], rates[i][2], rates[i][3], rates[i][4],
                    peak, low);
        }

        
        System.out.println("\n=== DAILY CHANGES (Compared to Previous Day) ===");
        System.out.println("(+ increase / - decrease / 'No Change' for same value)\n");

        for (int i = 0; i < currencies.length; i++) {
            System.out.println("Currency: " + currencies[i]);
            for (int d = 0; d < 4; d++) {

                double today = rates[i][d];
                double next = rates[i][d + 1];

                System.out.print("Day " + (d + 1) + " -> Day " + (d + 2) + ": ");

                if (next > today) {
                    System.out.printf("+ %.2f\n", (next - today));
                } else if (next < today) {
                    System.out.printf("- %.2f\n", (today - next));
                } else {
                    System.out.println("No Change");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

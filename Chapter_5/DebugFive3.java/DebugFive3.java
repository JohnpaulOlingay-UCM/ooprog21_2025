import java.util.Scanner;

public class DebugFive3 {
    public static void main(String[] args) {
        int item;
        String output;
        final int LOW = 111;
        final int HIGH = 999;
        final int CUTOFF = 500;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter item number >> ");
        item = input.nextInt();

        if (item < LOW) {
            output = "Item number too low";
        } else if (item > HIGH) {
            output = "Item number too high";
        } else if (item < CUTOFF) {
            output = "Valid - Item in Automotive Department";
        } else {
            output = "Valid - Item in Housewares Department";
        }

        System.out.println(output);
    }
}

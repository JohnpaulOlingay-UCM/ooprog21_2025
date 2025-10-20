import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance;
        double interestRate = 0.03;
        int choice = 1;
        int year = 1;

        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();

        while (choice == 1) {
           
            balance = balance + (balance * interestRate);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.2f%n",
                    year, interestRate, balance);

            
            System.out.print("Do you want to see the balance at the end of another year?\n");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();

            year++;
        }

        System.out.println("Operation complete.");
        input.close();
    }
}

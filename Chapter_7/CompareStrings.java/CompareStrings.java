import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String predefined = "Carmen";

        System.out.print("Enter your name > ");
        String input = sc.nextLine();

        if (input.equals(predefined)) {
            System.out.println(input + " equals " + predefined);
        } else {
            System.out.println(input + " does not equal " + predefined);
        }
        
        sc.close();
    }
}

import java.util.*;

public class DebugSeven3
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      String quote, charString;
      char searchChar;

      System.out.print("Enter a famous quote >> ");
      quote = kb.nextLine();

      System.out.print("Enter a character to search for >> ");
      charString = kb.next();         
      searchChar = charString.charAt(0);

      System.out.println("index of ('" + searchChar + "') is: " + 
                          quote.indexOf(searchChar));
      System.out.println("indexOf('a') is: " + quote.indexOf('a'));
      System.out.println("indexOf('x') is: " + quote.indexOf('x'));
      System.out.println("charAt(5) is: " + quote.charAt(5));
      System.out.println("replace('e', '*') is: " + quote.replace('e', '*'));
   }
}

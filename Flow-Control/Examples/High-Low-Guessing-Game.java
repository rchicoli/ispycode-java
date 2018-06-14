
import java.util.*;

public class HighLowGuessingGame {

   public static void main(String[] args) {

      Random random = new Random();
      Scanner scanner = new Scanner(System.in);

      int number = random.nextInt(100)+1;
      int guess = -1;
      int count=0;

      while (guess!=number) {
         count=count+1;
         System.out.print("Enter a number between 1 and 100: ");
         guess = scanner.nextInt();
         if (guess<number) {
            System.out.println("Too low, please try again");
         } else if (guess>number) {
            System.out.println("Too high, please try again");
         } else {
            System.out.println("Correct, the number was " + number);
         }
      }
      System.out.println("It took you " + count + " trys.");
   }
}



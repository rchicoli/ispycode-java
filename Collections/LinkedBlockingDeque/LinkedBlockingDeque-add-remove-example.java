import java.util.NoSuchElementException;
import java.util.concurrent.LinkedBlockingDeque;

public class Example {

   public static void main(String[] args) {

      // create LinkedBlockingDeque with a fixed size
      LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>(3);

      // add a bunch of elements
      for (int i = 1; i <= 5; i++) {
         try {
            deque.add(i);
            System.out.println("Added: " + i);
         } catch (IllegalStateException e) {
            System.out.println("Failed to add " + i + " : " + e.toString());
         }
      }

      // print out deque
      System.out.println(deque);

      // try and remove 5 elements
      for (int i = 1; i <= 5; i++) {
         try {
            int x = deque.remove();
            System.out.println("Removed: " + x);
         } catch (NoSuchElementException e) {
            System.out.println("Failed to remove: " + e.toString());
         }
      }

   }
}



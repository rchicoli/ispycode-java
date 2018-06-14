import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Example {

   public static void main(String[] args) {

      // create ConcurrentLinkedDeque
      ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();

      // add elements with offer
      deque.add(10);
      deque.add(20);
      deque.add(30);

      // iterator
      System.out.println("Iterator");
      Iterator itr = deque.iterator();
      while (itr.hasNext()) {
         int i = (int) itr.next();
         System.out.println(i);
      }

      // functional operations
      System.out.println("functional operations");
      deque.forEach((i) -> {
         System.out.println(i);
      });

      // for loop
      System.out.println("for loop");
      for (int i : deque) {
         System.out.println(i);
      }
   }
}



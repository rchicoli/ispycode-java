import java.util.concurrent.ConcurrentLinkedDeque;

public class Example {

   public static void main(String[] args) {

      // create ConcurrentLinkedDeque
      ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();

      // add element
      deque.add(10);

      // print out deque
      System.out.println(deque);

      // add element
      deque.add(20);

      // print out deque
      System.out.println(deque);

      // add element
      deque.add(30);

      // print out deque
      System.out.println(deque);

   }
}



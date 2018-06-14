import java.util.concurrent.ConcurrentLinkedDeque;

public class Example {

   public static void main(String[] args) {

      // create ConcurrentLinkedDeque
      ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();

      // add elements
      deque.add(10);
      deque.add(20);
      deque.add(30);

      // print out ConcurrentLinkedDeque
      System.out.println(deque);

      boolean b = deque.contains(30);
      System.out.println("30 exists: " + b);

      b = deque.contains(99);
      System.out.println("99 exists: " + b);

   }
}



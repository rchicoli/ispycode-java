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

      // use poll to get head and remove it
      int i = deque.poll();
      System.out.println("i: " + i);

      // print out ConcurrentLinkedDeque
      System.out.println(deque);
   }
}



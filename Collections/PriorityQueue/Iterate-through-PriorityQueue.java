import java.util.Iterator;
import java.util.PriorityQueue;

public class Example {

   public static void main(String[] args) {

      // create priority queue
      PriorityQueue<Integer< pq = new PriorityQueue<<();

      // add elements with offer
      pq.offer(10);
      pq.offer(20);
      pq.offer(30);
      pq.offer(40);

      // iterator
      System.out.println("Iterator");
      Iterator itr = pq.iterator();
      while (itr.hasNext()) {
         int i = (int) itr.next();
         System.out.println(i);
      }

      // functional operations
      System.out.println("Functional operations");
      pq.forEach((i) -< {
         System.out.println(i);
      });

      // for loop
      System.out.println("For loop");
      for (int i : pq) {
         System.out.println(i);
      }

   }
}



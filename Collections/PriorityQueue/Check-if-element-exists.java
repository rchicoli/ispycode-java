import java.util.PriorityQueue;

public class Example {

   public static void main(String[] args) {

      // create priority queue
      PriorityQueue<Integer> pq = new PriorityQueue<>();

      // add elements with offer
      pq.offer(10);
      pq.offer(20);
      pq.offer(30);
      pq.offer(40);

      // print out queue
      System.out.println(pq);

      // check if 20 exists
      boolean b = pq.contains(20);
      System.out.println("20: " + b);

      // check if 99 exists
      b = pq.contains(99);
      System.out.println("99: " + b);

   }
}



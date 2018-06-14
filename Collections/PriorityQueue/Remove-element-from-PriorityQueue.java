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

      // print out queue
      System.out.println(pq);

      // remove element
      boolean i = pq.remove(30);

      // print out queue
      System.out.println(pq);

   }
}



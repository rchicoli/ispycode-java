import java.util.Arrays;
import java.util.PriorityQueue;

public class Example {

   public static void main(String[] args) {

      // create priority queue
      PriorityQueue<Integer> pq = new PriorityQueue<>();

      // add elements with offer
      pq.offer(10);
      pq.offer(20);
      pq.offer(30);

      // print out queue
      System.out.println(pq);

      // PriorityQueue to array
      Integer[] array = pq.toArray(new Integer[pq.size()]);
      System.out.println(Arrays.toString(array));
   }
}



import java.util.ArrayDeque;

public class Example {

   public static void main(String[] args) {

      // create array deque
      ArrayDeque<Integer> ad = new ArrayDeque<>();

      // add element with offer
      ad.offer(10);
      System.out.println(ad);

      // add element with offer
      ad.offer(20);
      System.out.println(ad);

      // add element with offer
      ad.offer(30);
      System.out.println(ad);
   }
}



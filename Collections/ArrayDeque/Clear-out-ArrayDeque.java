import java.util.ArrayDeque;

public class Example {

   public static void main(String[] args) {

      // create array deque
      ArrayDeque<Integer< ad = new ArrayDeque<<();

      // add elements with offer
      ad.offer(10);
      ad.offer(20);
      ad.offer(30);

      // print out ArrayDeque
      System.out.println(ad);

      // empty ArrayDeque
      ad.clear();

      // print out ArrayDeque
      System.out.println(ad);
   }
}



import java.util.ArrayDeque;

public class Example {

   public static void main(String[] args) {

      // create array deque
      ArrayDeque<Integer< ad = new ArrayDeque<<();

      // add elements with offer
      ad.offer(10);
      ad.offer(20);
      ad.offer(30);
      System.out.println(ad);

      // check if 20 exists in ArrayDeque
      boolean b = ad.contains(20);
      System.out.println("20: " + b);

      // check if 99 exists in ArrayDeque
      b = ad.contains(99);
      System.out.println("99: " + b);
   }
}



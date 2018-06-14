import java.util.ArrayDeque;

public class Example {

   public static void main(String[] args) {

      // create ArrayDeque
      ArrayDeque<Integer> ad = new ArrayDeque<>();

      // add elements with offer
      ad.offer(10);
      ad.offer(20);
      ad.offer(30);

      // print out ArrayDeque
      System.out.println(ad);

      // get head and remove it
      int i = ad.poll();
      System.out.println("i: " + i);

      // print out ArrayDeque
      System.out.println(ad);
   }
}



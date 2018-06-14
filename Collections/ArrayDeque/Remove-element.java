import java.util.ArrayDeque;

public class Example {

   public static void main(String[] args) {

      // create ArrayDeque
      ArrayDeque<Integer> ad = new ArrayDeque<>();

      // add elements
      ad.add(10);
      ad.add(20);
      ad.add(30);

      // print out ArrayDeque
      System.out.println(ad);

      // get size of ArrayDeque
      boolean b = ad.remove(20);

      System.out.println("removed: " + b);

      // print out ArrayDeque
      System.out.println(ad);
   }
}



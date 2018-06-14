import java.util.ArrayDeque;
import java.util.Iterator;

public class Example {

   public static void main(String[] args) {

      // create array deque
      ArrayDeque<Integer< ad = new ArrayDeque<<();

      // add elements with offer
      ad.add(10);
      ad.add(20);
      ad.add(30);
      ad.add(40);

      // iterator
      System.out.println("Iterator");
      Iterator itr = ad.iterator();
      while (itr.hasNext()) {
         int i = (int) itr.next();
         System.out.println(i);
      }

      // functional operations
      System.out.println("functional operations");
      ad.forEach((i) -< {
         System.out.println(i);
      });

      // for loop
      System.out.println("for loop");
      for (int i : ad) {
         System.out.println(i);
      }

   }
}



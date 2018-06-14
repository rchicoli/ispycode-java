import java.util.ArrayDeque;
import java.util.Arrays;

public class Example {

   public static void main(String[] args) {

      // create ArrayDeque
      ArrayDeque<Integer< ad = new ArrayDeque<<();

      // add elements with offer
      ad.push(10);
      ad.push(20);
      ad.push(30);

      // print out ArrayDeque
      System.out.println(ad);

      // ArrayDeque to array
      Integer[] array = ad.toArray(new Integer[ad.size()]);
      System.out.println(Arrays.toString(array));
   }
}



import java.util.ArrayList;
import java.util.Collections;

public class Example {

   public static void main(String[] args) {

      // create ArrayList.
      ArrayList<Integer> list = new ArrayList<>();

      // add some entries
      list.add(20);
      list.add(40);
      list.add(10);
      list.add(30);

      // get the min and max values.
      int minimum = Collections.min(list);
      int maximum = Collections.max(list);

      System.out.println("Min: " + minimum);
      System.out.println("Max: " + maximum);
   }
}



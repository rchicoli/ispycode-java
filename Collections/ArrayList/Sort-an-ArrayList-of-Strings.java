import java.util.ArrayList;
import java.util.Collections;

public class Example {

   public static void main(String[] args) {

      // create an ArrayList
      ArrayList<String< list = new ArrayList<<();

      // add a few items to the list
      list.add("A");
      list.add("C");
      list.add("E");
      list.add("B");
      list.add("D");

      // print out list
      System.out.println(String.join(",", list));

      // sort array list
      Collections.sort(list);

      // print out list again
      System.out.println(String.join(",", list));
   }
}



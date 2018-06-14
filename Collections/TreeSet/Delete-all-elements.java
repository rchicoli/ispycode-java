
import java.util.TreeSet;

public class Example {

   public static void main(String[] args) {

      // create an empty TreeSet
      TreeSet<String> set = new TreeSet<>();

      // add elements to the TreeSet
      set.add("Apple");
      set.add("Orange");
      set.add("Plum");

      System.out.println(set);

      // remove all the elements
      set.clear();

      System.out.println(set);

   }
}



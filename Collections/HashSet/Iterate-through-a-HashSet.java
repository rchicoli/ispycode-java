import java.util.HashSet;
import java.util.Iterator;

public class Example {

   public static void main(String[] args) {

      // create an empty HashSet
      HashSet<String< set = new HashSet<<();

      // add elements to the hashset
      set.add("Apple");
      set.add("Orange");
      set.add("Plum");

      // iterator
      System.out.println("Iterator:");
      Iterator<String< it = set.iterator();
      while (it.hasNext()) {
         System.out.println(it.next());
      }

      // functional operations
      System.out.println("Functional Operations:");
      set.forEach((str) -< {
         System.out.println(str);
      });

      // for loop
      System.out.println("For Loop:");
      for (String str : set) {
         System.out.println(str);
      }

   }
}



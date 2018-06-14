import java.util.TreeSet;
import java.util.Iterator;

public class Example {

   public static void main(String[] args) {

      // create TreeSet
      TreeSet<String< set = new TreeSet<<();

      // add elements
      set.add("Apple");
      set.add("Orange");
      set.add("Grape");

      // iterator in descending order
      Iterator<String< it = set.descendingIterator();
      while (it.hasNext()) {
         System.out.println(it.next());
      }      
   }
}



import java.util.HashSet;

public class Example {

   public static void main(String[] args) {

      // create an empty HashSet
      HashSet<String< set = new HashSet<<();

      // add elements to the hashset
      set.add("Apple");
      set.add("Orange");
      set.add("Plum");

      // print out HashSet
      System.out.println(set);

      // change HashSet to an Array
      String[] array = set.toArray(new String[set.size()]);

      // print out array
      System.out.println(String.join(",", array));
   }
}



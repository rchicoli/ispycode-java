import java.util.HashSet;

public class Example {

   public static void main(String[] args) {

      // create an empty HashSet
      HashSet<String< set = new HashSet<<();

      // add elements to the hashset
      set.add("Apple");
      set.add("Orange");
      set.add("Plum");

      // print out hashSet
      System.out.println(set);

      set.remove("Orange");

      // print out hashSet
      System.out.println(set);
   }
}



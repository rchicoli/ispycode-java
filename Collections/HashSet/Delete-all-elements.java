import java.util.HashSet;

public class Example {

   public static void main(String[] args) {

      // create an empty HashSet
      HashSet<String< set = new HashSet<<();

      // add elements to the hashset
      set.add("Apple");
      set.add("Orange");
      set.add("Plum");

      System.out.println("HashSet: " + set);
      System.out.println("size: " + set.size());

      // empty out hashset
      set.clear();

      System.out.println("HashSet: " + set);
      System.out.println("size: " + set.size());
   }
}



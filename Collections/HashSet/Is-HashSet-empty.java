import java.util.HashSet;

public class Example {

   public static void main(String[] args) {

      // create an empty HashSet
      HashSet<String> set = new HashSet<>();

      boolean b1 = set.isEmpty();
      System.out.println("Empty: " + b1);

      // add elements to the hashset
      set.add("Apple");
      set.add("Orange");
      set.add("Plum");

      boolean b2 = set.isEmpty();
      System.out.println("Empty: " + b2);
   }
}



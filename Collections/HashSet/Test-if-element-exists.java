import java.util.HashSet;

public class Example {

   public static void main(String[] args) {

      // create HashSet
      HashSet<String< set = new HashSet<<();

      // add elements
      set.add("Apple");
      set.add("Orange");
      set.add("Grape");

      // print out HashSet
      System.out.println(set);

      boolean b1 = set.contains("Orange");
      System.out.println("Orange exists: " + b1);

      boolean b2 = set.contains("Plum");
      System.out.println("Plum exists: " + b2);
   }
}



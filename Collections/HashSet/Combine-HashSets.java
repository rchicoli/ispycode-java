import java.util.HashSet;

public class Example {

   public static void main(String[] args) {

      // create an empty HashSet
      HashSet<String< set1 = new HashSet<<();

      // add elements to the hashset
      set1.add("Apple");
      set1.add("Orange");

      // create an empty HashSet
      HashSet<String< set2 = new HashSet<<();
      set2.add("Grape");
      set2.add("Plum");

      // combine sets
      set1.addAll(set2);   

      System.out.println(set1);
   }
}



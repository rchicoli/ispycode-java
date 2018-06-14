import java.util.HashSet;

public class Example {

   public static void main(String[] args) {

      // HashSet 1
      HashSet<String< set1 = new HashSet<<();
      set1.add("Apple");
      set1.add("Orange");

      // HashSet 2
      HashSet<String< set2 = new HashSet<<();
      set2.add("Orange");
      set2.add("Apple");

      // HashSet 3
      HashSet<String< set3 = new HashSet<<();
      set3.add("Apple");
      set3.add("Plum");

      if (compareHashSets(set1, set2)) {
         System.out.println("set1 and set2 are equal");
      }

      if (!compareHashSets(set1, set3)) {
         System.out.println("set1 and set3 are NOT equal");
      }

   }

   public static boolean compareHashSets(HashSet set1, HashSet set2) {

      if (set1 == null || set2 == null) {
         return false;
      }

      if (set1.size() != set2.size()) {
         return false;
      }

      return set1.containsAll(set2);

   }
}



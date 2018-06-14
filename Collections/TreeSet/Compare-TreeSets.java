import java.util.TreeSet;

public class Example {

   public static void main(String[] args) {

      // TreeSet 1
      TreeSet<String> set1 = new TreeSet<>();
      set1.add("Apple");
      set1.add("Orange");

      // TreeSet 2
      TreeSet<String> set2 = new TreeSet<>();
      set2.add("Orange");
      set2.add("Apple");

      // TreeSet 3
      TreeSet<String> set3 = new TreeSet<>();
      set3.add("Apple");
      set3.add("Plum");

      if (compareHashSets(set1, set2)) {
         System.out.println("set1 and set2 are equal");
      }

      if (!compareHashSets(set1, set3)) {
         System.out.println("set1 and set3 are NOT equal");
      }

   }

   public static boolean compareHashSets(TreeSet set1, TreeSet set2) {

      if (set1 == null || set2 == null) {
         return false;
      }

      if (set1.size() != set2.size()) {
         return false;
      }

      return set1.containsAll(set2);

   }
}



import java.util.ArrayList;

public class Example {

   public static void main(String[] args) throws Exception {

      // create first ArrayList.
      ArrayList<Integer> list1 = new ArrayList<>();
      list1.add(1);
      list1.add(2);
      list1.add(3);

      // create second ArrayList.
      ArrayList<Integer> list2 = new ArrayList<>();
      list2.add(3);
      list2.add(2);
      list2.add(1);

      System.out.println(compareList(list1, list2));

      // change an entry
      list1.set(1, 99);
      System.out.println(compareList(list1, list2));

   }

   // compare unordered ArrayLists
   static boolean compareList(ArrayList a1, ArrayList a2) {
      if (a1 == null || a2 == null) {
         return false;
      }
      if (a1.size() != a2.size()) {
         return false;
      }
      ArrayList list = new ArrayList(a1);
      for (Object o : a2) {
         list.remove(o);
      }
      return list.isEmpty();
   }

}



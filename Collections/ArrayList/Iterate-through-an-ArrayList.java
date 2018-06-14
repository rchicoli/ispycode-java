import java.util.ArrayList;
import java.util.Iterator;

public class Example {

   public static void main(String[] args) {

      // create an empty array list
      ArrayList<String> list = new ArrayList();

      list.add("Apple");
      list.add("Orange");
      list.add("Grape");
      list.add("Plum");

      // List Iterator
      Iterator itr = list.iterator();
      while (itr.hasNext()) {
         String str = (String) itr.next();
         System.out.println(str + " ");
      }

      // functional operations
      list.forEach((str) -> {
         System.out.println(str + " ");
      });

      // for loop
      for (String str : list) {
         System.out.println(str + " ");
      }

   }
}



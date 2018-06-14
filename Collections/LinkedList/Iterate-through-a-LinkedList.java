import java.util.Iterator;
import java.util.LinkedList;

public class Example {

   public static void main(String[] args) {

      // create  LinkedList
      LinkedList<Integer> list = new LinkedList<>();

      // Adding elements to the LinkedList
      list.add(20);
      list.add(40);
      list.add(10);
      list.add(30);

      System.out.println("For loop");
      for (int i = 0; i < list.size(); i++) {
         System.out.println(list.get(i));
      }

      System.out.println("Iterator");
      Iterator itr = list.iterator();
      while (itr.hasNext()) {
         int x = (int) itr.next();
         System.out.println(x);
      }

      System.out.println("Functional operations");
      list.forEach((i) -> {
         System.out.println(i);
      });

   }
}



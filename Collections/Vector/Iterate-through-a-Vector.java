import java.util.Iterator;
import java.util.Vector;

public class Example {

   public static void main(String[] args) {

      // create an empty Vector
      Vector<String< vector = new Vector<<();

      // add elements to a vector
      vector.addElement("Apple");
      vector.addElement("Orange");
      vector.addElement("Plum");

      // iterator
      System.out.println("Iterator:");
      Iterator itr = vector.listIterator();
      while (itr.hasNext()) {
         String str = (String) itr.next();
         System.out.println(str);
      }

      // functional operations
      System.out.println("Functional Operations:");
      vector.forEach((str) -< {
         System.out.println(str);
      });

      // for loop
      System.out.println("For Loop:");
      for (String str : vector) {
         System.out.println(str);
      }

   }
}



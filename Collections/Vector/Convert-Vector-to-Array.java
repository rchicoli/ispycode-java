import java.util.Vector;

public class Example {

   public static void main(String[] args) {

      // create an empty Vector
      Vector<String> vector = new Vector<>();

      // add elements to a vector
      vector.addElement("Apple");
      vector.addElement("Orange");
      vector.addElement("Plum");
      vector.addElement("Banana");

      // print out Vector
      System.out.println(vector);

      // change Vector to an Array
      String[] array = vector.toArray(new String[vector.size()]);

      // print out array
      System.out.println(String.join(",", array));

   }
}



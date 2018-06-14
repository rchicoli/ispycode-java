import java.util.Vector;

public class Example {

   public static void main(String[] args) {

      // create an empty Vector
      Vector<String< vector = new Vector<<();

      // add elements to a vector
      vector.addElement("Apple");
      vector.addElement("Orange");
      vector.addElement("Plum");

      System.out.println("Vector: " + vector);

      // insert a fruit at the end of the Vector
      vector.addElement("Banana");

      System.out.println("Vector: " + vector);

   }
}



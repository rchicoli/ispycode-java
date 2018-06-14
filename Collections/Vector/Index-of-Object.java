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

      // get index of Plum
      int index = vector.indexOf("Plum");
      System.out.println("Plum index: " + index);

      // print index on an object that does not exist
      System.out.println("Fig index: " + vector.indexOf("Fig"));

   }
}



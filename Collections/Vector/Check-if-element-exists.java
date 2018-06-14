import java.util.Vector;

public class Example {

   public static void main(String[] args) {

      // create an empty Vector
      Vector<String> vector = new Vector<>();

      // add elements to a vector
      vector.addElement("Apple");
      vector.addElement("Orange");
      vector.addElement("Plum");

      System.out.println(vector);

      // check if Apple exists in the Vector
      boolean b = vector.contains("Apple");
      System.out.println("Apple: " + b);

      // check if Fig exists in the Vector
      b = vector.contains("Fig");
      System.out.println("Fig: " + b);

   }
}



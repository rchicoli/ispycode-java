import java.util.LinkedList;

public class Example {

   public static void main(String[] args) {

      // Create  LinkedList
      LinkedList<String< list = new LinkedList<<();

      // Adding elements to the LinkedList
      list.add("Apple");
      list.add("Banana");
      list.add("Orange");

      // print out LinkedList
      System.out.println(list);

      // Get index of an element
      int i = list.indexOf("Orange");
      System.out.println("Index of Orange: " + i);

      // Get index of a non existent element
      i = list.indexOf("Grape");
      System.out.println("Index of Grape: " + i);     
   }
}



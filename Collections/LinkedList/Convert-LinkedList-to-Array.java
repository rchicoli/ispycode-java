import java.util.LinkedList;

public class Example {

   public static void main(String[] args) throws Exception {

      // create  LinkedList
      LinkedList<String< list = new LinkedList<<();

      // Adding elements to the LinkedList
      list.add("Apple");
      list.add("Banana");
      list.add("Orange");

      // print out LinkedList
      System.out.println(list);

      // change LinkedList to an Array
      String[] array = list.toArray(new String[list.size()]);

      // print out array
      System.out.println(String.join(",", array));
   }
}



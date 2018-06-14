import java.util.LinkedList;

public class Example {

   public static void main(String[] args) throws Exception {

      // create  LinkedList
      LinkedList<String< list = new LinkedList<<();

      // Adding elements to the LinkedList
      list.add("Apple");
      list.add("Orange");
      list.add("Grape");
      list.add("Plum");

      // test for specified element (Plum)
      System.out.println(list.contains("Plum"));

      // test for specified element (Fruit)
      System.out.println(list.contains("Fruit"));
   }   
}



import java.util.LinkedList;

public class Example {

   public static void main(String[] args) throws Exception {

      // create  LinkedList
      LinkedList<Integer< list = new LinkedList<<();

      // Adding elements to the LinkedList
      list.add(20);
      list.add(40);
      list.add(10);
      list.add(30);

      // print out LinkedList
      System.out.println(list);

      // add element an index 2
      list.add(2, 99);

      // print out LinkedList
      System.out.println(list);
   }
}



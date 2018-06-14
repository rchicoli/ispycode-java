import java.util.LinkedList;

public class Example {

   public static void main(String[] args) {

      // create  LinkedList
      LinkedList<Integer> list = new LinkedList<>();

      // Adding elements to the LinkedList
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);

      // print out list
      System.out.println(list);

      // replace index 2 with a 99
      list.set(2, 99);

      // print out list
      System.out.println(list);

   }
}



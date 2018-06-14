import java.util.LinkedList;

public class Example {

   public static void main(String[] args) throws Exception {

      // create  LinkedList
      LinkedList<Integer> list = new LinkedList<>();

      // Adding elements to the LinkedList
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);

      // print out LinkedList
      System.out.println(list);

      // get and remove the last element on the list.
      Integer last = list.removeLast();
      System.out.println("last: " + last);

      // print out LinkedList
      System.out.println(list);
   }
}



import java.util.LinkedList;

public class Example {

   public static void main(String[] args) {

      // create  LinkedList
      LinkedList<Integer< list = new LinkedList<<();

      // add elements list
      list.add(20);
      list.add(40);
      list.add(10);
      list.add(30);

      // print out list
      System.out.println(list);

      // retrieve first element without removing it
      Integer i = list.element();
      System.out.println("i: " + i);

      // print out list
      System.out.println(list);
   }
}



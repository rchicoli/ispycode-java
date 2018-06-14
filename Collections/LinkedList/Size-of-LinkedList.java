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

      int size = list.size();

      // print out size
      System.out.println("size: " + size);     
   }
}



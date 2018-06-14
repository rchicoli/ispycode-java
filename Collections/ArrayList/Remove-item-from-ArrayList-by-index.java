import java.util.ArrayList;

public class Example {

   public static void main(String[] args) {

      // create an ArrayList
      ArrayList<String> list = new ArrayList<>();

      // add a few items to the list
      list.add("Apple");
      list.add("Banana");
      list.add("Orange");

      // print out list
      System.out.println(String.join(",", list));

      // remove an entry
      list.remove(1);

      // print out list again
      System.out.println(String.join(",", list));
   }
}



import java.util.ArrayList;

public class Example {

   public static void main(String[] args) {

      // create an ArrayList
      ArrayList<String> list = new ArrayList<>();

      // add a few items to the list
      list.add("Apple");
      list.add("Plum");
      list.add("Orange");

      // print out list
      System.out.println(String.join(",", list));

      // change an entry
      list.set(1,"Banana");

      // print out list again
      System.out.println(String.join(",", list));
   }
}



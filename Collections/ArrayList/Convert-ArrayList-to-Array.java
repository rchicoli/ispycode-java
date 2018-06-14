import java.util.ArrayList;

public class Example {

   public static void main(String[] args) {

      // create an ArrayList
      ArrayList<String> list = new ArrayList<>();

      // add a few items to the list
      list.add("Apple");
      list.add("Banana");
      list.add("Orange");

      // print out ArrayList
      System.out.println(String.join(",", list));

      String [] array = list.toArray(new String[list.size()]);

      // print out array
      System.out.println(String.join(",", array));
   }
}



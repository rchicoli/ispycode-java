import java.util.ArrayList;

public class Example {

   public static void main(String[] args) {

      // create an ArrayList
      ArrayList<String< list = new ArrayList<<();

      // add a few items to the list
      list.add("Apple");
      list.add("Banana");
      list.add("Orange");

      // print out ArrayList
      System.out.println(String.join(",", list));

      // get size of ArrayList
      int size = list.size();
      System.out.println("Size: " + size);

   }
}



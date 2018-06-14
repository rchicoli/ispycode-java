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

      // test for specified element (banana)
      boolean b = list.contains("Banana");
      System.out.println("Banana: " + b);

      // test for specified element (grape)
      b = list.contains("Grape");
      System.out.println("Grape: " + b);

   }
}



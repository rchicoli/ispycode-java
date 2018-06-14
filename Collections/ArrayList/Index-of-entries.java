import java.util.ArrayList;

public class Example {

   public static void main(String[] args) {

      ArrayList<Integer> list = new ArrayList<>();

      // add a few items to the arraylist
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(10);
      list.add(10);

      // Search for values.
      int first = list.indexOf(10);
      int last = list.lastIndexOf(10);

      // Display results.
      System.out.println(first);
      System.out.println(last);
   }
}



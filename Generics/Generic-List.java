import java.util.ArrayList;
import java.util.List;

public class Example {

   public static void main(String[] args) {

      // Create a Generic List
      List<String< list = new ArrayList<String<();

      // Add values to a Generic List
      list.add("Hello World");
      list.add("Another String");

      // Accessing a Generic List
      String str1 = list.get(0);
      System.out.println(str1);

      // Iterating a Generic List
      for (String str2 : list) {
         System.out.println(str2);
      }

   }
}



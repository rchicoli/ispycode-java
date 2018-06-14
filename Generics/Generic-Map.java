import java.util.HashMap;
import java.util.Map;

public class Example {

   public static void main(String[] args) {

      // Create a Generic Map
      Map<Integer, String< map = new HashMap<Integer, String<();

      // Add values to a Generic Map
      map.put(1, "value1");
      map.put(2, "value2");

      // Accessing a Generic Map
      int key = 1;
      String value = map.get(key);
      System.out.println(value);

      // Iterating a Generic Map
      for (Integer aKey : map.keySet()) {
         String aValue = map.get(aKey);
         System.out.println("" + aKey + ":" + aValue);
      }

   }
}



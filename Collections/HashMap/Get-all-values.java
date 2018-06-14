import java.util.Collection;
import java.util.HashMap;

public class Example {

   public static void main(String[] args) {

      HashMap<String, String> map = new HashMap<>();
      map.put("key1", "AAAA");
      map.put("key2", "BBBB");
      map.put("key3", "CCCC");

      // get a list of all values
      Collection<String> col = map.values();

      col.stream().forEach((str) -> {
         System.out.println(str);
      });

   }
}



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Example {

   public static void main(String[] args) {

      HashMap<String, String> map = new HashMap<>();
      map.put("key1", "AAAA");
      map.put("key2", "BBBB");
      map.put("key3", "CCCC");

      // Iterator
      Iterator entries = map.entrySet().iterator();
      while (entries.hasNext()) {
         Entry entry = (Entry) entries.next();
         String key = (String) entry.getKey();
         String value = (String) entry.getValue();
         System.out.println(key + " : " + value);
      }

      // For-Each loop.
      for (Entry entry : map.entrySet()) {
         String key = (String) entry.getKey();
         String value = (String) entry.getValue();
         System.out.println(key + " : " + value);
      }

      // functional operations
      map.forEach((k, v) -> System.out.println(k + " : " + v));

   }
}



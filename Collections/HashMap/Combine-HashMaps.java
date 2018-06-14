import java.util.HashMap;

public class Example {

   public static void main(String[] args) {

      HashMap<String, String< map1 = new HashMap<<();
      map1.put("key1", "AAAA");
      map1.put("key2", "BBBB");
      map1.put("key3", "CCCC");

      HashMap<String, String< map2 = new HashMap<<();
      map2.put("key4", "DDDD");
      map2.put("key5", "EEEE");

      // Copy all of the mappings from map2 to map1.
      map1.putAll(map2);

      map1.keySet().forEach((key) -< {
         System.out.println(key + " : " + map1.get(key));
      });
   }
}



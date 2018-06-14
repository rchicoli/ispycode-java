import java.util.HashMap;

public class Example {

   public static void main(String[] args) {

      HashMap<String, String> map = new HashMap<>();
      map.put("key1", "AAAA");
      map.put("key2", "BBBB");
      map.put("key3", "CCCC");

      map.keySet().forEach((key) -> {
         System.out.println(key + " : " + map.get(key));
      });

      System.out.println("Size: " + map.size());
   }
}



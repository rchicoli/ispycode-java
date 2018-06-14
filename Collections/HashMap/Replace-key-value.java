import java.util.HashMap;

public class Example {

   public static void main(String[] args) {

      HashMap<String, String> map = new HashMap<>();
      map.put("key1", "AAAA");
      map.put("key2", "BBBB");
      map.put("key3", "CCCC");

      System.out.println("Before");
      map.keySet().forEach((key) -> {
         System.out.println(key + " : " + map.get(key));
      });

      // replace key
      map.replace("key2", "DDDD");

      // replace key that does not exist
      map.replace("key4", "EEEE");

      System.out.println("After");
      map.keySet().forEach((key) -> {
         System.out.println(key + " : " + map.get(key));
      });
   }
}



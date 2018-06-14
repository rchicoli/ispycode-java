import java.util.HashMap;

public class Example {

   public static void main(String[] args) {

      HashMap<String, String< map = new HashMap<<();
      map.put("key1", "AAAA");
      map.put("key2", "BBBB");

      System.out.println("Before");
      map.keySet().forEach((key) -< {
         System.out.println(key + " : " + map.get(key));
      });

      // add key
      map.put("key3", "CCCC");
      System.out.println("After");
      map.keySet().forEach((key) -< {
         System.out.println(key + " : " + map.get(key));
      });
   }
}



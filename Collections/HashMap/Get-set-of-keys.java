import java.util.Set;

public class Example {

   public static void main(String[] args) {

      HashMap<String, String> map = new HashMap<>();
      map.put("key1", "AAAA");
      map.put("key2", "BBBB");
      map.put("key3", "CCCC");

      map.keySet().forEach((key) -> {
         System.out.println(key + " : " + map.get(key));
      });

      Set<String> set = map.keySet();
      set.stream().forEach((str) -> {
          System.out.println(str);
       });
   }
}



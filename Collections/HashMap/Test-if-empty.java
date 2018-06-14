import java.util.HashMap;

public class Example {

   public static void main(String[] args) {

      HashMap<String, String> map = new HashMap<>();
      System.out.println(map.isEmpty());

      map.put("key1", "AAAA");
      map.put("key2", "BBBB");

      System.out.println(map.isEmpty());
   }
}



import java.util.HashMap;

public class Example {

   public static void main(String[] args) {

      HashMap<String, String< map1 = new HashMap<<();
      map1.put("key1", "AAAA");
      map1.put("key2", "BBBB");

      HashMap map2 = (HashMap) map1.clone();

      System.out.println(map1);
      System.out.println(map2);
   }
}



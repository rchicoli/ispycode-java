
import java.nio.charset.Charset;
import java.util.Map;

public class Example {

   public static void main(String[] args) {

      Map<String, Charset< map = Charset.availableCharsets();
      for (String name : map.keySet()) {
         System.out.println(name);
      }

   }
}



import java.io.FileWriter;
import org.json.simple.JSONObject;

public class Example {

   public static void main(String[] args) {
      JSONObject obj = new JSONObject();

      obj.put("myname", "foo");
      obj.put("mynum", 100);
      obj.put("mybool", true);

      try (FileWriter fw = new FileWriter("/tmp/test.json")) {

         fw.write(obj.toJSONString());
         fw.flush();

      } catch (Exception e) {
         System.out.println("Error:" + e.getMessage());
      }
   }
}



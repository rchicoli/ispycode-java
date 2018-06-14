import org.json.simple.JSONObject;

public class Example {

   public static void main(String[] args) {
      JSONObject obj = new JSONObject();

      obj.put("myname", "foo");
      obj.put("mynum", 100);
      obj.put("mybool", true);

      System.out.print(obj);
   }
}



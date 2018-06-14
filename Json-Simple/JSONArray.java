import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Example {

   public static void main(String[] args) {

      JSONObject obj1 = new JSONObject();
      obj1.put("myname", "name1");
      obj1.put("mynum", 100);

      JSONObject obj2 = new JSONObject();
      obj2.put("myname", "name2");
      obj2.put("mynum", 200);

      JSONObject obj3 = new JSONObject();
      obj3.put("myname", "name3");
      obj3.put("mynum", 300);

      JSONArray ja = new JSONArray();
      ja.add(obj1);
      ja.add(obj2);
      ja.add(obj3);

      System.out.print(ja);
   }
}



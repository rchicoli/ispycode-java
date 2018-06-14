import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;

public class Example {

   public static void main(String[] args) throws IOException {

      String json = "[{\"id\":1,\"name\":\"bean1\"},{\"id\":2,\"name\":\"bean2\"}]";
      ArrayList <MyBean> list;
      list = new ObjectMapper().readValue(json, new TypeReference<ArrayList<MyBean>>() {});
      for (MyBean bean : list) {
         System.out.print("ID:" + bean.getId());
         System.out.println(" Name:" + bean.getName());
      }
   }
}

class MyBean {

   private int id;
   private String name;

   public MyBean() {
   }

   public MyBean(int id, String name) {
      this.id = id;
      this.name = name;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}



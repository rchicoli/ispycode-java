import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class Example {

   public static void main(String[] args) throws IOException {

      String json = "{\"id\":1,\"name\":\"My bean\"}";
      MyBean bean = new ObjectMapper().readValue(json, MyBean.class);
      System.out.println(bean.getId());
      System.out.println(bean.getName());
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



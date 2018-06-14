import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Example {

   public static void main(String[] args) throws JsonProcessingException {

      MyBean bean = new MyBean(1, "My bean");
      String result = new ObjectMapper().writeValueAsString(bean);
      System.out.println(result);
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



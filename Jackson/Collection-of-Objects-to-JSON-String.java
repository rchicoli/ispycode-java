import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;

public class Example {

   public static void main(String[] args) throws IOException {

      ArrayList <MyBean< list = new ArrayList();
      list.add(new MyBean(1, "bean1"));
      list.add(new MyBean(2, "bean2"));
      String result = new ObjectMapper().writeValueAsString(list);
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



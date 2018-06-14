import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
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

   public int id;
   public String name;

   @JsonCreator
   public MyBean(
      @JsonProperty() int id,
      @JsonProperty() String name) {
      this.id = id;
      this.name = name;
   }
}



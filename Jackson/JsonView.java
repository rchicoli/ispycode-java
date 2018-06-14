import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Example {

   public static void main(String[] args) throws JsonProcessingException {

      Thing thing = new Thing("Hello","Horld");
      ObjectMapper mapper = new ObjectMapper();

      System.out.println("Public View");
      String normalView = mapper.writerWithView(Views.Public.class).writeValueAsString(thing);
      System.out.println(normalView);

      System.out.println("Private View");
      String privateView = mapper.writerWithView(Views.Private.class).writeValueAsString(thing);
      System.out.println(privateView);

   }
}

class Thing {

   @JsonView(Views.Public.class)
   public String str1;

   @JsonView(Views.Private.class)
   public String str2;

   @JsonCreator
   public Thing(
      @JsonProperty() String str1,
      @JsonProperty() String str2) {
      this.str1 = str1;
      this.str2 = str2;
   }
}

class Views {
   public static class Public {}
   public static class Private extends Public {}
}



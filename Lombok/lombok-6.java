import lombok.Builder;
import lombok.ToString;

public class Example {

   public static void main(String[] args) {

      Square square = Square.builder()
         .height(10)
         .width(20)
         .build();

      System.out.println(square.toString());
   }
}

@Builder
@ToString(includeFieldNames=true)
class Square {
   int width, height;
}



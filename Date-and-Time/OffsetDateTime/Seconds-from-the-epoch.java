import java.time.OffsetDateTime;

public class Example {

   public static void main(String[] args) {

      OffsetDateTime offsetDateTime = OffsetDateTime.now();
      System.out.println(offsetDateTime.toEpochSecond());
   }
}



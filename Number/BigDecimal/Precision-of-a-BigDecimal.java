
import java.math.BigDecimal;

public class Example {

   public static void main(String[] args) {

      // create BigDecimal using specified value.
      BigDecimal bd = new BigDecimal(123.456789);

      // get the precision value of the BigDecimal.
      int precision = bd.precision();

      // print precision
      System.out.println(precision);

   }
}



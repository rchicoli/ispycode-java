
import java.math.BigDecimal;

public class Example {

   public static void main(String[] args) {

      // create BigDecimal using specified value.
      BigDecimal bd = new BigDecimal(9876.54321);

      // get the scale of the BigDecimal.
      int scale = bd.precision();

      // print scale
      System.out.println(scale);

   }
}



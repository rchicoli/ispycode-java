
import java.math.BigDecimal;

public class Example {

   public static void main(String[] args) {

      // create BigDecimal
      BigDecimal bd = new BigDecimal(12345);


      // get negate value of the BigDecimal
      BigDecimal negate = bd.negate();

      // print negate
      System.out.println(negate);

   }
}




import java.math.BigDecimal;

public class Example {

   public static void main(String[] args) {

      // create BigDecimals
      BigDecimal bd1 = new BigDecimal(125);
      BigDecimal bd2 = new BigDecimal(100);

      // get remainder
      BigDecimal remainder = bd1.remainder(bd2);

      // print remainder
      System.out.println(remainder);

   }
}



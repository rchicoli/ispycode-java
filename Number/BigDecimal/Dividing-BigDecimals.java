
import java.math.BigDecimal;

public class Example {

   public static void main(String[] args) {

      BigDecimal bd1 = new BigDecimal(100.001);
      BigDecimal bd2 = new BigDecimal(2);

      BigDecimal total = bd1.divide(bd2);

      System.out.println("Total: " + total);

   }
}



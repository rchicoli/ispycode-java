
import java.math.BigDecimal;

public class Example {

   public static void main(String[] args) {

      BigDecimal bd1 = new BigDecimal(10);
      BigDecimal bd2 = new BigDecimal(7);

      BigDecimal total = bd1.remainder(bd2);

      System.out.println("Remainder: " + total);

   }
}



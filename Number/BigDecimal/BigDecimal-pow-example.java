
import java.math.BigDecimal;

public class Example {

   public static void main(String[] args) {

      BigDecimal bd = new BigDecimal(100);
      int exponent = 2;

      BigDecimal total = bd.pow(exponent);

      System.out.println("Total: " + total);

   }
}



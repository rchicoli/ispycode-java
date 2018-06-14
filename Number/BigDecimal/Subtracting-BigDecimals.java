import java.math.BigDecimal;

public class Example {

   public static void main(String[] args) {

      BigDecimal bd1 = new BigDecimal("333.33");
      BigDecimal bd2 = new BigDecimal("222.22");

      BigDecimal total = bd1.subtract(bd2);

      System.out.println("Total: " + total);

   }
}



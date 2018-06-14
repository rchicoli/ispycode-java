import java.math.BigDecimal;

public class Example {

   public static void main(String[] args) {

      BigDecimal bd1 = new BigDecimal("11.11");
      BigDecimal bd2 = new BigDecimal("22.22");

      BigDecimal total = bd1.multiply(bd2);

      System.out.println("Total: " + total);

   }
}



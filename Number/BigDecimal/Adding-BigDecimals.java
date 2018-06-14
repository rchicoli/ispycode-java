import java.math.BigDecimal;

public class Example {

   public static void main(String[] args) {

      BigDecimal bd1 = new BigDecimal("123.45");
      BigDecimal bd2 = new BigDecimal("567.89");

      BigDecimal total = bd1.add(bd2);

      System.out.println("Total: " + total);

   }
}



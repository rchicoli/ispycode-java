import java.math.BigDecimal;

public class Example {

   public static void main(String[] args) {

      BigDecimal bd = new BigDecimal(123456);

      BigDecimal negative = bd.negate();

      System.out.println("negated value: " + negative);

   }
}



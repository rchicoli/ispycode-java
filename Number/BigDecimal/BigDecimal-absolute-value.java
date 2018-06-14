import java.math.BigDecimal;

public class Example {

   public static void main(String[] args) {

      BigDecimal bd = new BigDecimal(-123456);

      BigDecimal absolute = bd.abs();

      System.out.println("Absolute value: " + absolute);

   }
}




import java.math.BigInteger;

public class Example {

   public static void main(String[] args) {

      BigInteger b1 = new BigInteger("99");
      BigInteger b2 = new BigInteger("66");

      // Get greatest common divisor
      BigInteger b3 = b1.gcd(b2);

      // print output
      System.out.println(b3);

   }
}



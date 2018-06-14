
import java.math.BigInteger;

public class Example {

   public static void main(String[] args) {

      BigInteger b1 = new BigInteger("555");
      BigInteger b2 = new BigInteger("111");

      // subtract
      BigInteger b3 = b1.subtract(b2);

      // print output
      System.out.println(b3);

   }
}



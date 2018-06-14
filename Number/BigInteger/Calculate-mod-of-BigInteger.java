
import java.math.BigInteger;

public class Example {

   public static void main(String[] args) {

      BigInteger b1 = new BigInteger("100");
      BigInteger b2 = new BigInteger("95");

      // mod of two BigIntegers
      BigInteger b3 = b1.mod(b2);

      // print output
      System.out.println(b3);

   }
}



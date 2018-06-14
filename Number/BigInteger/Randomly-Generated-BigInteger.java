
import java.math.BigInteger;
import java.util.Random;

public class Example {

   public static void main(String[] args) {

      // create a BigInteger from a string
      BigInteger bi = new BigInteger(10, new Random());

      // print randomly generated BigInteger
      System.out.println(bi);

   }
}



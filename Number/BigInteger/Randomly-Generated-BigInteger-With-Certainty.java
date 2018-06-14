
import java.math.BigInteger;
import java.util.Random;

public class Example {

   public static void main(String[] args) {

      int bitLength = 10;
      int certainty = 5;

      // create a BigInteger from a string
      BigInteger bi = new BigInteger(bitLength, certainty, new Random());

      // print randomly generated BigInteger with certainty
      System.out.println(bi);

   }
}



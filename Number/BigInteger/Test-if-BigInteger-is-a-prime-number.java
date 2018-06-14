import java.math.BigInteger;

public class Example {

   public static void main(String[] args) {

      for (int i = 1; i < 100; i++) {
         if (checkPrime(i)) {
            System.out.println(i);
         }
      }
   }

   public static boolean checkPrime(int n) {
      // Converting long to BigInteger
      BigInteger b = new BigInteger(String.valueOf(n));

      return b.isProbablePrime(1);
   }
}



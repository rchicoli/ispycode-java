
public class Example {

   public static void main(String[] args) {

      // An integer type contains 32 bit information.
      // 8 = 00000000000000000000000000001000
      int x = 8;
      System.out.println("x: " +  x);
      System.out.println("Binary: 0x" + Integer.toBinaryString(x));

      /*
       Using the ~ operator inverts the number by changing
       every "0" to "1" and every "1" to "0".

       00000000000000000000000000001000
       11111111111111111111111111110111
      */
      int y = ~x;
      System.out.println("y: " + y);
      System.out.println("Binary: 0x" + Integer.toBinaryString(y));
   }
}



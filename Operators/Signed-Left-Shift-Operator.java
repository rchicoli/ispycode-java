
public class Example {

   public static void main(String[] args) {

      // An integer type contains 32 bit information.
      // 8 = 00000000000000000000000000001000
      int x = 8;
      System.out.println("x: " +  x);
      System.out.println("Binary: 0x" + Integer.toBinaryString(x));

      int y = x << 2;
      System.out.println("y: " + y);
      System.out.println("Binary: 0x" + Integer.toBinaryString(y));
   }
}



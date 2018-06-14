
public class Example {

   public static void main(String[] args) {

      // An integer type contains 32 bit information.
      // 1073741824 == 10000000000000000000000000001000
      int x = 0b1000000000000000000000000000000;
      System.out.println("x: " +  x);
      System.out.println("Binary: 0x" + Integer.toBinaryString(x));

      int y = x >>> 1;
      System.out.println("y: " + y);
      System.out.println("Binary: 0x" + Integer.toBinaryString(y));
   }
}



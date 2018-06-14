
public class Example {

   public static void main(String[] args) {

      int x = 0b1101;
      int y = 0b1010;

      int z = x & y;

      System.out.println("x: " +  x);
      System.out.println("Binary: 0x" + Integer.toBinaryString(x));

      System.out.println("y: " + y);
      System.out.println("Binary: 0x" + Integer.toBinaryString(y));

      System.out.println("z: " + z);
      System.out.println("Binary: 0x" + Integer.toBinaryString(z));
   }
}




public class Example {

   public static void main(String[] args) {

      // decimal: 255
      // binary:  0b11111111
      // higest one bit: 0b10000000

      // Get highest one bit
      Integer i = Integer.highestOneBit(255);

      // print Integer
      System.out.println(i);

   }
}




public class Example {

   public static void main(String[] args) {

      // decimal: 65536
      // binary:  0b00000000_00000001_00000000_00000000;
      // trailing zeros: 8

      // get number of trailing zeros
      int x = Integer.numberOfTrailingZeros(65536);

      // print output
      System.out.println(x);

   }
}



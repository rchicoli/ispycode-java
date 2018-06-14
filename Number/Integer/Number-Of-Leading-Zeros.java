
public class Example {

   public static void main(String[] args) {

      // decimal: 256
      // binary:  0b00000000_00000000_00000001_00000000;
      // leading zeros: 23

      // get number of leading zeros
      int i = Integer.numberOfLeadingZeros(256);

      // print output
      System.out.println(i);

   }
}



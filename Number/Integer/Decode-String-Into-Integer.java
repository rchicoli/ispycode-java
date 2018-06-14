
public class Example {

   public static void main(String[] args) {

      // decodes a decimal String into an Integer.
      Integer i1 = Integer.decode("12345");
      System.out.println(i1);

      // decodes a hexadecimal String into an Integer.
      Integer i2 = Integer.decode("0xffff");
      System.out.println(i2);

      // decodes a octal String into an Integer.
      Integer i3 = Integer.decode("01234");
      System.out.println(i3);

   }
}



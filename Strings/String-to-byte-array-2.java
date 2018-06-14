public class Example {

   public static void main(String[] args) {

      String str = "Hello World";

      // string to byte array
      byte[] b = str.getBytes();

      // print out string
      System.out.println(str);

      // print out byte array
      for(int i=0; i<b.length; i++){
         System.out.print((char)b[i]);
      }
   }
}



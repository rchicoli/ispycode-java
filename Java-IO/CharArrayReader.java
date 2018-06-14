import java.io.CharArrayReader;
import java.io.IOException;

public class Example {

   public static void main(String[] args) throws IOException {

      char[] chars = "Hello World".toCharArray();
      CharArrayReader reader = new CharArrayReader(chars);

      int data = reader.read();
      while (data != -1) {
         System.out.print((char)data);
         data = reader.read();
      }
      reader.close();
   }
}



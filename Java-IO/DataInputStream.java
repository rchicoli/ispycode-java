import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example {

   public static void main(String[] args) throws IOException {

      try (InputStream input = new FileInputStream("/tmp/text.txt"); 
         DataInputStream dis = new DataInputStream(input)) {
         int result = dis.read();
         while (result != -1) {
            System.out.print((char) result);
            result = dis.read();
         }
      }
   }
}



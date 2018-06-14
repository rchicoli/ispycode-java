import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Example {

   public static void main(String[] args) throws IOException {

      byte[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
      ByteArrayInputStream inputStream = new ByteArrayInputStream(array);

      try (BufferedInputStream bis = new BufferedInputStream(inputStream)) {
         int result = bis.read();
         while (result != -1) {
            System.out.println((byte) result);
            result = bis.read();
         }
      }
   }
}



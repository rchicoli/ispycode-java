import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {

   public static void main(String[] args) throws IOException {

      byte[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
      ByteArrayInputStream inputStream = new ByteArrayInputStream(array);

      try (InputStreamReader is = new InputStreamReader(inputStream)) {
         int result = is.read();
         while (result != -1) {
            System.out.println(result);
            result = is.read();
         }
      }
   }
}



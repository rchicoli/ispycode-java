import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Example {

   public static void main(String[] args) throws IOException {

      byte[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
      ByteArrayInputStream input = new ByteArrayInputStream(array);

      try (Reader reader = new BufferedReader(new InputStreamReader(input))) {
         int i = 0;
         while ((i = reader.read()) != -1) {
            System.out.print(i + " ");
         }
      }
   }
}



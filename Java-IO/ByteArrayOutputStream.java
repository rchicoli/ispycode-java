import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Example {

   public static void main(String[] args) throws IOException {

      try (ByteArrayOutputStream output = new ByteArrayOutputStream()) {
         for (int i = 1; i <= 10; i++) {
            output.write(i);
         }
         try (ByteArrayInputStream input = new ByteArrayInputStream(output.toByteArray());
            Reader reader = new BufferedReader(new InputStreamReader(input))) {
            int i = 0;
            while ((i = reader.read()) != -1) {
               System.out.print(i + " ");
            }
         }
      }
   }
}



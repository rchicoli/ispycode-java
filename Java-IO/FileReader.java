import java.io.FileReader;
import java.io.IOException;

public class Example {

   public static void main(String[] args) throws IOException {

      try (FileReader fr = new FileReader("/tmp/text.out")) {
         int result = fr.read();
         while (result != -1) {
            System.out.print((char) result);
            result = fr.read();
         }
      }
   }
}



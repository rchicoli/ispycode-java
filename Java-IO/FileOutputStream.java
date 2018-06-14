import java.io.FileOutputStream;
import java.io.IOException;

public class Example {

   public static void main(String[] args) throws IOException {

      try (FileOutputStream input = new FileOutputStream("/tmp/file.txt")) {
         byte[] bytes = "Hello World".getBytes();
         input.write(bytes);
      }
   }
}



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Example {

   public static void main(String[] args) throws IOException {

      try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("/tmp/text.txt"))) {
         writer.write("Hello");
         writer.write(" ");
         writer.write("World");
         writer.write(System.lineSeparator());
      }
   }
}



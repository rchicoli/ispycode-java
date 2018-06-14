import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example {

   public static void main(String[] args) throws IOException {

      try (BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream("/tmp/text.txt"))) {
         stream.write("Hello".getBytes());
         stream.write(" ".getBytes());
         stream.write("World".getBytes());
         stream.write("!".getBytes());
         stream.write(System.lineSeparator().getBytes());
      }
   }
}



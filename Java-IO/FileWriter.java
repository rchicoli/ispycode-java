import java.io.FileWriter;
import java.io.IOException;

public class Example {

   public static void main(String[] args) throws IOException {

      try (FileWriter fw = new FileWriter("/tmp/text.out")) {
         fw.write("Java is fun.\n");
      }
   }
}



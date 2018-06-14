import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Example {

   public static void main(String[] args) throws IOException {

      try (FileWriter writer = new FileWriter("/tmp/text.out"); 
         BufferedWriter buffer = new BufferedWriter(writer)) {
         buffer.write("Java is fun.\n");
      }
   }
}



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {

   public static void main(String[] args) throws IOException {

      try (FileReader fr = new FileReader("/tmp/text.txt")) {
         BufferedReader br = new BufferedReader(fr);

         int i;
         while ((i = br.read()) != -1) {
            System.out.print((char) i);
         }
         br.close();
      }
   }
}



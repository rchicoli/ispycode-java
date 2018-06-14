import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example {

   public static void main(String[] args) throws IOException {

      try (FileOutputStream file = new FileOutputStream("/tmp/text.out"); 
         DataOutputStream data = new DataOutputStream(file)) {
         data.writeBytes("Java is fun!\n");
      }
   }
}



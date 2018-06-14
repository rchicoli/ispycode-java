
import java.io.File;

public class Example {

   public static void main(String[] args) {
      boolean success = (new File("/tmp/myfile")).delete();
      if (success) {
         System.out.println("success");
      }
   }
}



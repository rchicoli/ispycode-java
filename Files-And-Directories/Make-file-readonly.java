import java.io.File;

public class Example {
   public static void main(String[] args) {
      File myfile = new File("/tmp/myfile");
      boolean result = myfile.setReadOnly();
      if (result == true) {
         System.out.println("Success");
      }
   }
}



import java.io.File;

public class Example {

   public static void main(String[] args) {

      File file1 = new File("/tmp/myfile.txt");

      if (file1.isHidden()) {
         System.out.println("file1 is hidden");
      } else {
         System.out.println("file1 is not hidden");
      }

      File file2 = new File("/tmp/.myfile.txt");

      if (file2.isHidden()) {
         System.out.println("file2 is hidden");
      } else {
         System.out.println("file2 is not hidden");
      }

   }
}



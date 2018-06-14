import java.io.File;
import java.io.IOException;

public class Example {

   public static void main(String[] args) throws IOException {

      File folder = new File("/tmp");
      File[] listOfFiles = folder.listFiles();

      for (File listOfFile : listOfFiles) {
         if (listOfFile.isFile()) {
            System.out.println("File " + listOfFile.getName());
         } else if (listOfFile.isDirectory()) {
            System.out.println("Directory " + listOfFile.getName());
         }
      }
   }
}



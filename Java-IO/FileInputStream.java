import java.io.FileInputStream;
import java.io.IOException;

public class Example {

   public static void main(String[] args) throws IOException {

      String str;
      try (FileInputStream input = new FileInputStream("/tmp/file.txt")) {
         int i = 0;
         str = "";
         while ((i = input.read()) != -1) {
            str = str + (char)i;
         }
      }

      System.out.println(str);   
   }
}



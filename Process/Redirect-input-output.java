import java.io.*;
import java.util.Scanner;

public class Grep {

   // ps -e | grep java 

   public static void main(String[] args) {

      try {
         Process p1 = Runtime.getRuntime().exec("ps -el");
         InputStream input = p1.getInputStream();

         Process p2 = Runtime.getRuntime().exec("grep java");
         try (OutputStream output = p2.getOutputStream()) {
            byte[] buffer = new byte[1024];
            int len = input.read(buffer);
            while (len != -1) {
               output.write(buffer, 0, len);
               len = input.read(buffer);
            }
         }

         Scanner sc = new Scanner(p2.getInputStream());
         while (sc.hasNext()) {
            System.out.println(sc.nextLine());
         }

      } catch (IOException e) {
         e.getMessage();
      }

   }
}



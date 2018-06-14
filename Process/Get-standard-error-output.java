import java.io.*;
import java.util.Scanner;

public class Example {

   public static void main(String[] args) {

      try {
         Process p = Runtime.getRuntime().exec("ls /no_dir");
         Scanner sc = new Scanner(p.getErrorStream());
         while (sc.hasNext()) {
            System.out.println(sc.nextLine());
         }
      } catch (IOException e) {
         System.out.println(e.getMessage());
      }

   }
}



import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Example {

   public static void main(String[] args) throws IOException {

      ProcessBuilder pb = new ProcessBuilder("cat");
      File log = new File("/tmp/data");
      pb.redirectInput(log);

      Process p = pb.start();

      Scanner sc = new Scanner(p.getInputStream());
      while (sc.hasNext()) {
         System.out.println(sc.nextLine());
      }
   }
}



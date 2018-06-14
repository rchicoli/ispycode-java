import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Example {

   public static void main(String[] args) throws IOException {

      ProcessBuilder pb = new ProcessBuilder("pwd");

      File workdir = new File("/tmp");
      pb.directory(workdir);

      Process process = pb.start();
      Scanner sc = new Scanner(process.getInputStream());
      while (sc.hasNext()) {
         System.out.println(sc.nextLine());
      }
   }
}



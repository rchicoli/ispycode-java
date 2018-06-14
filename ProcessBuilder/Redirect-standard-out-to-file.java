import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

public class Example {

   public static void main(String[] args) throws IOException {

      ProcessBuilder pb = new ProcessBuilder("ps", "-ea");

      File log = new File("/tmp/log");
      pb.redirectOutput(Redirect.to(log));

      Process p = pb.start();

      System.out.println("Done");
   }
}




import java.nio.charset.Charset;

public class Example {

   public static void main(String[] args) {

      // get Charset from a String
      Charset charset = Charset.forName("UTF-8");

      // print out Charset
      System.out.println(charset);
   }
}



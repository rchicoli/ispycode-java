
import java.nio.charset.Charset;

public class Example {

   public static void main(String[] args) {

      // get the default charset 
      Charset charset = Charset.defaultCharset();

      // print charsets canonical name.
      String name = charset.name();

      // prin the name
      System.out.println( name );
   }
}



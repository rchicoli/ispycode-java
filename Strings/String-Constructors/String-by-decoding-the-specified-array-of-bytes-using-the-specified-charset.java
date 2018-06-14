
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Example {

   public static void main(String[] args) throws UnsupportedEncodingException {

      byte[] array = "Hello World".getBytes("utf-8");

      String str = new String(array, Charset.defaultCharset());
      System.out.println(str);

   }
}



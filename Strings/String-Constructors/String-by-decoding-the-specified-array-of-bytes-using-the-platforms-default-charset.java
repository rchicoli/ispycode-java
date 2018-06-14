
import java.io.UnsupportedEncodingException;

public class Example {

   public static void main(String[] args) throws UnsupportedEncodingException {

      byte[] array = "Hello World".getBytes("utf-8");

      String str = new String(array);
      System.out.println(str);

   }
}



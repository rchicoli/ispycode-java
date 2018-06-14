
import java.io.UnsupportedEncodingException;

public class Example {

   public static void main(String[] args) throws UnsupportedEncodingException {

      byte[] array = "Hello World".getBytes("utf-8");

      String str = new String(array,0,7,"utf-8");
      System.out.println(str);

   }
}



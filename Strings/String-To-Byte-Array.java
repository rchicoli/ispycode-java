
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Example {

   public static void main(String[] args) throws UnsupportedEncodingException {

      String str = "Hello World";

      // Convert Java String into byte[]
      byte[] array = str.getBytes("utf-8");

      System.out.println(Arrays.toString(array));

   }
}



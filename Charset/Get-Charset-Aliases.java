
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

public class Example {

   public static void main(String[] args) {

      // get default charset
      Charset  cs = Charset.defaultCharset();

      Set set = cs.aliases();

      // print list charsets aliases.
      Iterator<String> it = set.iterator();
      while (it.hasNext()) {
         System.out.println(it.next());
      }

   }
}



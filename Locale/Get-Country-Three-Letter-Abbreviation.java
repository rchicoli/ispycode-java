
import java.util.Locale;

public class Example {

   public static void main(String[] args) {

      // get the default locale 
      Locale locale = Locale.getDefault();

      // get language
      String language = locale.getISO3Country();

      // print language
      System.out.println(language);

   }
}



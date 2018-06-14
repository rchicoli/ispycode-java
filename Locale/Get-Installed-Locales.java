
import java.util.Locale;

public class Example {

   public static void main(String[] args) {

      // get installed locales.
      Locale locales[] = Locale.getAvailableLocales();

      /// print locales
      for (Locale locale : locales) {
         System.out.println(locale);
      }

   }
}



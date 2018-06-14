
mport java.util.Locale;

public class Example {

    public static void main(String[] args) {

        // get a locale
        Locale locale = new Locale("en", "US");

        // get a charset
        Charset charset = Charset.forName("UTF-8");

        // display human readable name for a given locale
        System.out.println(charset.displayName(locale));

    }
}



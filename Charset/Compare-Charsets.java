
import java.nio.charset.Charset;

public class Example {

    public static void main(String[] args) {

        // get default charset
        Charset cs1 = Charset.defaultCharset();
        Charset cs2 = Charset.defaultCharset();

        // compare charsets

        // A negative integer, zero, or a positive integer as this charset 
        // is less than, equal to, or greater than the specified charset

        int x = cs1.compareTo(cs2);

        System.out.println("Charset 1: " + cs1);
        System.out.println("Charset 2: " + cs2);
        System.out.println("Compare value: " + x);

    }
}



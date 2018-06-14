
import java.nio.charset.Charset;

public class Example {

    public static void main(String[] args) {

        // get default charset
        Charset cs = Charset.defaultCharset();

        // display human readable name 
        System.out.println(cs.displayName());


    }
}



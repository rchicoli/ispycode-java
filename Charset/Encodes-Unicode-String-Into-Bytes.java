
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
public class Example {

    public static void main(String[] args) {

        // get default charset
        Charset charset = Charset.defaultCharset();

        // encode unicode string into bytes in charset.
        ByteBuffer bb = charset.encode("Hello World");

        while (bb.hasRemaining()){
            byte b = bb.get();
            System.out.println(b + " " + (char)b );
        }

    }
}



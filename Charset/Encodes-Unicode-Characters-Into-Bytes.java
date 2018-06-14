
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class Example {

    public static void main(String[] args) {

        // get default charset       
        Charset charset = Charset.defaultCharset();

        // create a CharBuffer
        CharBuffer cb = CharBuffer.allocate(50);
        cb.append("Hello World");

        // encode unicode characters into bytes in charset.
        ByteBuffer bb = charset.encode(cb);

        while (bb.hasRemaining()){
            byte b = bb.get();
            System.out.println(b + " " + (char)b );
        }

    }
}



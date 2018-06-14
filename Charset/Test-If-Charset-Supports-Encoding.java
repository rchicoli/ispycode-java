
mport java.nio.charset.Charset;

public class Example {

   public static void main(String[] args) {

      // get default charset
      Charset  cs = Charset.defaultCharset();

      //does charset support encoding?
      boolean bool = cs.canEncode();

      System.out.println("Charset: " + Charset.defaultCharset());
      System.out.println("Can encode: " + bool);

   }
}



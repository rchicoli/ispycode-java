
public class Example {

    public static void main(String[] args) {

        // get a charset
        Charset charset = Charset.forName("UTF-8");

        // is charset registered in the IANA Charset Registry?
        boolean bool = charset.isRegistered();

        System.out.println("Charset: " + charset);
        System.out.println("isRegistered: " + bool);

    }
}



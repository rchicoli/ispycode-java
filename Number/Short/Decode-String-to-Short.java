public class Example {

    public static void main(String[] args) {

        // DecimalNumeral
        Short s1 = Short.decode("10");  
        System.out.println(s1);

        // 0X HexDigits
        Short s2 = Short.decode("0X1B");
        System.out.println(s2);

        // 0x HexDigits
        Short s3 = Short.decode("0x1a");
        System.out.println(s3);

        // # HexDigits
        Short s4 = Short.decode("#2c");
        System.out.println(s4);

        // OctalDigits
        Short s5 = Short.decode("010");
        System.out.println(s5);

    }
}




public class DefaultValues {

   byte b;
   short s;
   int i;
   long l;
   float f;
   double d;
   char c;
   boolean bool;
   String str;

   public static void main(String[] args) {
      Example example = new DefaultValues();
      System.out.println("Default byte value: " + example.b);
      System.out.println("Default short value: " + example.s);
      System.out.println("Default int value: " + example.i);
      System.out.println("Default long value: " + example.l);
      System.out.println("Default float value: " + example.f);
      System.out.println("Default double value: " + example.d);
      System.out.println("Default char value: " + example.c);
      System.out.println("Default boolean value: " + example.bool);
      System.out.println("Default String value: " + example.str);
   }
}



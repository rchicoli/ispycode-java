public class Example {

   public static void main(String[] args) {

      Float f1 = 123.456f;
      Float f2 = 123.456f;

      System.out.println(f1.floatValue() == f2.floatValue());

      int i = f1.compareTo(f2);
      System.out.println(i);

   }
}



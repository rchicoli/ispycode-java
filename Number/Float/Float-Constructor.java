public class Example {

   public static void main(String[] args) {

      double d = 123.456;
      Float f1 = new Float(d);

      float f = 123.456f;
      Float f2 = new Float(f);

      String str = "123.456";
      Float f3 = new Float(str);      

      System.out.println(f1);
      System.out.println(f2);
      System.out.println(f3);

   }
}



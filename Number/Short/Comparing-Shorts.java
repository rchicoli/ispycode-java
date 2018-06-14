public class Example {

   public static void main(String[] args) {

      Short s1 = new Short("10");
      Short s2 = new Short("10");
      Short s3 = new Short("15");

      System.out.println(Short.compare(s1, s2));
      System.out.println(Short.compare(s1, s3));
      System.out.println(Short.compare(s3, s2));

   }
}



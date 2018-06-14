public class Example {

   public static void main(String[] args) {


      Float f = new Float(0.0/0.0);
      System.out.println("float: " + f);

      // Test if float is not a number
      System.out.println("float: " + f.isNaN());

   }
}



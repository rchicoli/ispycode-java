
public class Example {

   public static void main(String[] args) {

      // create Double using specified double value.
      Double d = new Double(9.99d);

      // is NaN ?
      System.out.println(d.isNaN());

      d = Double.NaN;

      // is NaN ?
      System.out.println(d.isNaN());
   }
}



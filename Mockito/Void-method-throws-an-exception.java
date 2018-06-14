import org.mockito.Mockito;
import static org.mockito.Mockito.doThrow;

public class Example {

   public static void main(String[] args) {

      Foo foo = new Foo();
      Foo spy = Mockito.spy(foo);
      doThrow(new IllegalArgumentException("MOCK EXCEPTION")).when(spy).getNumber(55);

      try {
         spy.getNumber(0);
         spy.getNumber(1);
         spy.getNumber(55);
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}

class Foo {

   public void getNumber(int x) {
      if (x < 0) {
         throw new IllegalArgumentException("x is negative.");
      } else {
         System.out.println(x + " is good");
      }
   }
}



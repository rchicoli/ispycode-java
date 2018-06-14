import org.mockito.Mockito;
import static org.mockito.Mockito.doReturn;

public class Example {

   public static void main(String[] args) {

      Foo foo = new Foo();
      Foo spy = Mockito.spy(foo);
      doReturn(33333).when(spy).getNumber(3);

      System.out.println(spy.getNumber(1));
      System.out.println(spy.getNumber(3));
   }
}

class Foo {

   public int getNumber(int x) {
      return x;
   }
}



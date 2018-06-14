import lombok.Setter;

public class Example {

   public static void main(String[] args) {

      Foo foo = new Foo();
      foo.setNumber(99);

      System.out.println(foo.number);
      System.out.println(foo.string);

   }
}

class Foo {

   @Setter
   int number;

   String string;

}



import lombok.Getter;

public class Example {

   public static void main(String[] args) {

      Foo foo = new Foo();
      foo.number = 100;

      System.out.println(foo.number);
      System.out.println(foo.string);
   }
}

class Foo {

   @Getter
   int number;

   String string;
}



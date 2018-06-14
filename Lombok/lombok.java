import lombok.Builder;

public class Example {

   public static void main(String[] args) {

      Foo foo = Foo.builder()
         .number(10)
         .string("hello")
         .build();

      System.out.println(foo.number);
      System.out.println(foo.string);

   }
}

@Builder
class Foo {

   int number;
   String string;

}



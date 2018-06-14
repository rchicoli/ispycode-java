import lombok.Data;

public class Example {

   public static void main(String[] args) {

      Foo foo = new Foo();
      foo.setNumber(99);
      foo.setString("Hello");

      System.out.println(foo.getNumber());
      System.out.println(foo.getString());

   }
}

@Data
class Foo {

   int number;
   String string;

}



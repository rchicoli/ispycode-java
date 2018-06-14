
public class Example {

   public static void main(String[] args) {

      System.out.print("Enter something: ");

      char arr[] = System.console().readPassword();

      String str = String.valueOf(arr);

      System.out.println(str);
   }
}



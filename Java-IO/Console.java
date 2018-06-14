import java.io.Console;

public class Example {

   public static void main(String[] args) {

      String str;

      Console con = System.console();

      // Read a string and then display it.
      str = con.readLine("Enter some text: ");
      con.printf("You entered: %s\n", str);

      //to read password and then display it
      char[] ch = con.readPassword("Enter the password: ");

      //converting char array into string
      String pass = String.valueOf(ch);
      System.out.println("Password is: " + pass);
   }
}



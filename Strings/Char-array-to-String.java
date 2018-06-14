
public class Example {

   public static void main(String[] args) {

      // initialize array of chars
      char[] array = {'H', 'e', 'l', 'l', 'o'};

      // convert array to string using constructor
      String str1 = new String(array);
      System.out.println(str1);

      // convert array to string using valueOf
      String str2 = String.valueOf(array);
      System.out.println(str2);
   }
}



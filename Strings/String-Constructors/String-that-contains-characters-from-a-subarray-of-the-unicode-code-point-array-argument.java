
public class Example {

   public static void main(String[] args) {

      // Code points for "Hello World" is 
      // 72 101 108 108 111 32 87 111 114 108 100
      int[] array = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};

      String str = new String(array,1,8);
      System.out.println(str);

   }
}



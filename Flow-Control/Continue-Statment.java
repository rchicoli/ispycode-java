
public class ContinueStatement {
   public static void main(String[] args) {
      boolean b = true;
      int count = 0;
      while ( b ) {
        System.out.println("Count: " + count);
        if (count < 5) {
          count = count + 1;
          continue;
        } 
        b = false;
        System.out.println("Bottom" );
      }
   }
}



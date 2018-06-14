import java.io.File;

public class Example {

   public static void main(String[] args) {

      File file = new File("/tmp/myfile");
      long length = file.length();
      System.out.println("Size: " + length + " bytes");

   }
}



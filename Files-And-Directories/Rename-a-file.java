import java.io.File;

public class Example {
   public static void main(String[] args) {
      File oldName = new File("/tmp/oldfile.txt");
      if(oldName.renameTo( new File("/tmp/newfile.txt"))) {
         System.out.println("Renamed");
      } else {
         System.out.println("Error");
      }
   }
}



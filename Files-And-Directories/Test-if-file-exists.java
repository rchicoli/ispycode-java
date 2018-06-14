import java.io.File;

public class Example {

   public static void main(String[] args) {

      String myfile = "/tmp/myfile";
      File f = new File(myfile);
      if (f.exists()){
         System.out.println(myfile + " exists");
      } else {
         System.out.println(myfile + " does not exist");
      }
   }
}



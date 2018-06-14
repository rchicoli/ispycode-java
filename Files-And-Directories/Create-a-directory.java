import java.io.File;

public class Example {
   public static void main(String[] args) {
      File dir1 = new File("/tmp/mydir");
      boolean result = dir1.mkdir();
      if (result == true) {
          System.out.println("mkdir /tmp/mydir success");
      }

       File dir2 = new File("/tmp/a/long/path/mydir");
       result = dir2.mkdirs();
       if (result == true) {
           System.out.println("mkdir /tmp/a/long/path/mydir success");
       }
   }
}



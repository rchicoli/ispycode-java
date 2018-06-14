import java.io.IOException;
import org.apache.commons.io.FileSystemUtils;

public class Example {

   public static void main(String[] args) throws IOException {

      // disk size of the volume which holds the working directory.
      long freeSpace = FileSystemUtils.freeSpaceKb();
      System.out.println(freeSpace);

      // free space on a drive or volume in kilobytes
      freeSpace = FileSystemUtils.freeSpaceKb("/home");
      System.out.println(freeSpace);
   }
}



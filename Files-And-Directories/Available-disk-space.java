import java.io.File;

public class Example {

   public static void main(String[] args) {

      File file = new File("/");

      long totalSpace = file.getTotalSpace();
      long usableSpace = file.getUsableSpace();
      long freeSpace = file.getFreeSpace();

      System.out.println("Total space  : " + totalSpace/1024 + "K bytes");
      System.out.println("Usable space : " + usableSpace/1024 + "K bytes");
      System.out.println("Free space   : " + freeSpace/1024 + "K bytes");

   }
}



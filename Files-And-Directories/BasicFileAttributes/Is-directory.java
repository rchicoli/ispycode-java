import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Example {

   public static void main(String[] args) throws IOException {

      Path path = Paths.get("/tmp/Example.java");
      BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
      System.out.println("/tmp/Example.java: " + attr.isDirectory());

      path = Paths.get("/tmp");
      attr = Files.readAttributes(path, BasicFileAttributes.class);
      System.out.println("/tmp: " + attr.isDirectory());

   }
}



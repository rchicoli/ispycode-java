import java.io.CharArrayWriter;
import java.io.IOException;

public class Example {

   public static void main(String[] args) throws IOException {

      CharArrayWriter writer = new CharArrayWriter();
      writer.write('a');
      writer.write('b');
      writer.write('c');
      writer.write('d');
      writer.write('e');
      writer.close();

      System.out.println("Size: " + writer.size());
      System.out.println(writer.toCharArray());

      writer.close(); 
   }
}



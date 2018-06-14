import java.net.InetAddress;
import java.net.UnknownHostException;

public class Example {

   public static void main(String[] args) throws UnknownHostException {

      System.out.println(InetAddress.getByName("www.google.com").getHostAddress());
   }
}



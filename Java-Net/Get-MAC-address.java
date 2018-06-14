import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Example {

   public static void main(String a[]) throws UnknownHostException, SocketException {

      InetAddress ip = InetAddress.getLocalHost();
      NetworkInterface network = NetworkInterface.getByInetAddress(ip);
      byte[] mac = network.getHardwareAddress();
      String mystring = "";
      for (int i = 0; i < mac.length; i++) {
         mystring = mystring + String.format("%x", mac[i]);
         if (i < mac.length - 1) {
            mystring = mystring + ":";
         }
      }
      System.out.println(mystring);
   }
}



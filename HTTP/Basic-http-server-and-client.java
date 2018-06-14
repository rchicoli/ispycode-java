import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Example {

   public static void main(String[] args) throws Exception {

      // HTTP SERVER
      HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
      server.createContext("/hello", new InfoHandler());
      server.setExecutor(null); 
      server.start();

      // HTTP CLIENT
      URL url = new URL("http://localhost:8080/hello");
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("GET");
      StringBuilder content;
      try (BufferedReader in = new BufferedReader(
         new InputStreamReader(con.getInputStream()))) {
         String line;
         content = new StringBuilder();
         while ((line = in.readLine()) != null) {
            content.append(line);
            content.append(System.lineSeparator());
         }
      }
      System.out.println(content);

      server.stop(0);
   }

   static class InfoHandler implements HttpHandler {

      public void handle(HttpExchange t) throws IOException {
         String response = "Hello World\n";
         t.sendResponseHeaders(200, response.length());
         OutputStream os = t.getResponseBody();
         os.write(response.getBytes());
         os.close();
      }
   }
}



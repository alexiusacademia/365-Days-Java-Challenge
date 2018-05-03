import java.net.MalformedURLException;
import java.net.URL;
import java.io.*;

public class ParseURL {
  public static void main(String[] args) {
    URL url;
    try {
      url = new URL("https://alexiusacademia.com/index.html");
      System.out.println("Filename: " + url.getFile());
      System.out.println("Protocol: " + url.getProtocol());
      System.out.println("Port: " + url.getPort());
    } catch (MalformedURLException e) {
      System.out.println("An error has occurred: " + e);
    }

  }
}

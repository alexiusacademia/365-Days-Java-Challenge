package Day21.networking2; /**
* Read URL content
*/
import java.net.*;
import java.io.*;

public class ReadURL {
  public static void main(String[] args) {
    URL mySite;
    try {
       // URL of my personal website
       mySite = new URL("https://alexiusacademia.com");

       // Read the content of index file
       BufferedReader br = new BufferedReader(
               new InputStreamReader(mySite.openStream())
       );

       String line;

       // Print the source code
       while ((line = br.readLine()) != null) {
         System.out.println(line);
       }
       br.close();
    } catch (MalformedURLException e) {
      System.out.println("An error has occurred: " + e);
    } catch (IOException e) {
      System.out.println("An error has occurred: " + e);
    }
  }
}

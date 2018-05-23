package Day39;

import java.io.*;
import java.net.URL;
import org.apache.commons.io.FileUtils;

public class DownloadFile {
  public static void main(String[] args) {
    String source = "https://github.com/alexiusacademia/IrrigFlo/archive/1.2.0.zip";
    String destination = "v1.2.0.zip";

    try {
      // Connection timeout = 10 seconds
      // Read timeout = 10 seconds
      FileUtils.copyURLToFile(
        new URL(source),
        new File(destination),
        10000,
        10000
      );
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

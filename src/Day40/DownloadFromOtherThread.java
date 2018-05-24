package Day40;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.net.URL;

public class DownloadFromOtherThread {

  public static void main(String[] args) {
    String source = "https://github.com/alexiusacademia/IrrigFlo/archive/1.2.0.zip";
    DownloadFile df = new DownloadFile(source);
    df.start();
  }

}

class DownloadFile implements Runnable {
  private Thread thread;
  private String threadName;
  private String source;
  private String destination;
  public boolean downloadCompleted;

  public DownloadFile(String url) {
    this.source = url;
    this.destination = "downloads/lib-src.zip";
    this.threadName = "test";
  }

  @Override
  public void run() {
    printLine("Download started...");
    try {
      try {
        // Connection timeout = 10 seconds
        // Read timeout = 10 seconds
        FileUtils.copyURLToFile(new URL(source), new File(destination), 10000, 10000);

        System.out.println("File downloaded...");
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    this.downloadCompleted = true;
  }

  public void start() {
    if (this.thread == null) {
      this.thread = new Thread(this, this.threadName);
      this.thread.start();
    }
  }

  private void printLine(String s) {
    System.out.println(s);
  }
}

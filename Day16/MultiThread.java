/**
 * Demonstrating use of a thread
 */
public class MultiThread {
  public static void main(String[] args) {
    SampleThread st = new SampleThread("MyThread");
    st.start();
    SampleThread st2 = new SampleThread("My Second Thread");
    st2.start();
  }
}
// Thread class
class SampleThread implements Runnable {
  private Thread t;
  private String threadName;

  SampleThread(String name) {
    this.threadName = name;
    System.out.println("Creating " + this.threadName);
  }

  public void run() {
    System.out.println("Running " + this.threadName);

    try {
      for (int i=10; i>0; i--) {
        System.out.println("Thread: " + this.threadName + ", " + i);
        Thread.sleep(50);
      }
    } catch (InterruptedException e) {
      System.out.println("Thread " + this.threadName + " interrupted.");
    }
    System.out.println("Thread " + this.threadName + " exiting...");
  }

  public void start() {
    System.out.println("Starting " + this.threadName);
    if (this.t == null) {
      this.t = new Thread(this, this.threadName);
      this.t.start();
    }
  }
}

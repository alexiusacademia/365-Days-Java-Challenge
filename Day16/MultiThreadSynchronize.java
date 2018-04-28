/**
 * This mulithread demo will show unexpected results
 */

public class MultiThreadSynchronize {
  public static void main(String[] args) {
    MyObject obj = new MyObject();

    ThreadDemo td1 = new ThreadDemo("Thread 1 ", obj);
    ThreadDemo td2 = new ThreadDemo("Thread 2 ", obj);

    td1.start();
    td2.start();

    try {
      td1.join();
      td2.join();
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
}

class MyObject {
  public void printCount() {
    try {
      for (int i=0; i<10; i++) {
        System.out.println("Counter --- " + i);
      }
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
}

class ThreadDemo extends Thread {
  private Thread thread;
  private String threadName;
  MyObject obj;

  ThreadDemo(String name, MyObject o) {
    this.threadName = name;
    this.obj = o;
  }

  public void run() {
    synchronized(this.obj) {
      this.obj.printCount();
    }
    System.out.println("Thread " + this.threadName + " exiting...");
  }

  public void start() {
    if (this.thread == null) {
      this.thread = new Thread(this, this.threadName);
      this.thread.start();
    }
  }
}

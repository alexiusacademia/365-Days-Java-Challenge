package Day15; /**
 * This class demonstrate the use of Exception
 */

public class TryCatch {
  public static void main(String[] args) {
    // Try to catch division by zero
    int num = 10;
    try{
      num /= 0;
    } catch (Exception e) {
      System.out.println(e.toString());
    }
    System.out.println("Print the final value of num: " + num);
  }
}

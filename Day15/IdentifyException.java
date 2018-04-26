/**
 * This program tries to identify which
 * exception occurs
 */
import java.util.ArrayList;
import java.util.List;

public class IdentifyException {
  public static void main(String[] args) {
    List<Integer> ints = new ArrayList<>();
    ints.add(10);
    ints.add(4);

    int num = 0;

    try {
      //num = ints.get(3);
      num = ints.get(0) / 0;
    } catch (RuntimeException e) {

      String exception = e.getClass().getName();

      switch (exception) {
        // Print for index out of range
        case "java.lang.IndexOutOfBoundsException":
          System.out.println("Error: you are tring to access an index not found in the list.");
          break;

        case "java.lang.ArithmeticException":
          // Print for arithmetic operation
          System.out.println("Error");
          break;
          
        default:
          System.out.println(exception);
      }
    }

    System.out.println(num);
  }
}

/**
 * Create a custom exception
 */

public class ThrowException {
  public static void main(String[] args) {
    validateAge(16);
  }

  private static void validateAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Can't join right now.");
    } else {
      System.out.println("Welcome to the gang!");
    }
  }
}

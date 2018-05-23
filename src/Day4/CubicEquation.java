package Day4;// Write a program which reads a double value x and evaluates the result of x3+x2+x+1
// Output data format: The double result of the expression.
// Sample Input:
// 22.5
// Sample Output:
// 11920.375

import java.util.Scanner;

public class CubicEquation {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double x = input.nextDouble();
    x = x*x*x + x*x + x + 1;
    System.out.println(x);
  }
}
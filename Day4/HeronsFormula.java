// Many years ago when Paul went to school, he did not like the Heron's formula to calculate the area of a triangle, mainly because he considered it very complex. He decided to help all the other students in his school by writing and distributing a program, which could calculate the area of a triangle by using the lengths of its three sides.
// However, there was a problem: because Paul did not like the formula, he did not memorize it. Help him finish this act of kindness and write the program, calculating the area of a triangle by the transferred length of its sides, in accordance with the Heron's formula:
// S=p(p−a)(p−b)(p−c)−−−−−−−−−−−−−−−−−√
// where p=a+b+c2 – half-perimeter of the triangle.
// On the input, the program has integers, and the output should be a real number corresponding to the area of the triangle.
// Sample Input:
// 3
// 4
// 5
// Sample Output:
// 6.0

import java.util.Scanner;

public class HeronsFormula {

  public static void main(String[] args) {
      Scanner inputs = new Scanner(System.in);
      double a = inputs.nextDouble();
      double b = inputs.nextDouble();
      double c = inputs.nextDouble();
      double p = (a + b + c) / 2;
      double S;
      S = p * (p-a) * (p-b) * (p-c);
      S = Math.sqrt(S);
      System.out.print(S);
  }
}
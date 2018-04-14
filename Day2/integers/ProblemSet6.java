/*
* Problem Set 6
* =============
* You’re given a three-digit integer (i.e. an integer from 100 to 999). 
* Find the sum of its digits.
*
* Sample Input: 
* 476 
* Sample Output: 
* 17 
*/

import java.util.Scanner;

public class ProblemSet6 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int given = scanner.nextInt();

    int hundredth = given / 100;
    int tenth = (given - hundredth * 100) / 10;
    int ones = given - hundredth * 100 - tenth * 10;

    int sum = hundredth + tenth + ones;

    System.out.println(sum);
  }
}
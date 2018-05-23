package Day2.integers;/*
* Problem Set 5
* =============
* You’re given a two-digit number. Output its first digit 
* (i.e. the number of tens).
*
* Sample Input: 
* 42 
* Sample Output: 
* 4
*/

import java.util.Scanner;

public class ProblemSet5 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int given = scanner.nextInt();

    System.out.println((given / 10 * 10) / 10);
  }
}
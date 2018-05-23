package Day2.integers;/*
* Problem Set 4
* ==============
* You’re given a non-negative integer N (0 ≤ N ≤ 1000000), 
* find the number of tens in it (i.e. next to last digit of the number).
*
* If there is no next to last digit, you can consider that the number of 
* tens equals to zero.
*
* Sample Input: 
* 173 
* Sample Output: 
* 7 
*/

import java.util.Scanner;

public class ProblemSet4 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int given = scanner.nextInt();

    System.out.println((given - given / 100 * 100) / 10);
  }
}
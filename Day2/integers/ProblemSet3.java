/*
* Problem Set 3
* =============
* N squirrels found K nuts and decided to divide them equally. Find how many nuts will be left after each of the squirrels takes the equal amount of nuts.
*
* Input data format: There are two positive integers N and K, each of them is not greater than 10000.
* 
* Sample Input: 
* 3 
* 14 
* Sample Output: 
* 2 
*/

import java.util.Scanner;

public class ProblemSet3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N;
    int K;

    do {
      N = scanner.nextInt();
    } while (N > 10000);

    do {
      K = scanner.nextInt();
    } while (K > 10000);

    System.out.println(K % N);
  }
}

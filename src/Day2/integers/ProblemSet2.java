package Day2.integers;/*
* Problem Set 2
* ==========
* N squirrels found K nuts and decided to divide them equally. Determine how many nuts each squirrel will get.
*
* Input data format: There are two positive numbers N and K, each of them is not greater than 10000.
* 
* Sample Input: 
* 3 
* 14 
* Sample Output: 
* 4
*/ 

import java.util.Scanner;

public class ProblemSet2 {

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

    System.out.println(K / N);
  }
}
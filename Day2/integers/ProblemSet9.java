/*
* Problem Set 9
* ==============
* You have been given a natural number N, not greater than 10000. 
* Output the even number following this N.
*
* Sample Input: 
* 7 
* Sample Output: 
* 8 
*
* Sample Input: 
* 8 
* Sample Output: 
* 10 
*/

import java.util.Scanner;

public class ProblemSet9 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();

    if (num % 2 == 0) {
      num += 2;
    } else {
      num += 1;
    }

    System.out.println(num);
  }
}
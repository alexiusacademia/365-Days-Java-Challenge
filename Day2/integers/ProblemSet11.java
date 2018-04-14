/*
* Problem Set 11
* ===============
* Snail creeps up the vertical pole of height H feets. Each day it goes A 
* feets up, and each night it goes B feets down. On which day will the snail 
* reach the top of the pole?
*
* Input data format: On the input the program receives non-negative 
* integers H, A, B, where H > B and A > B. Every integer does not exceed 100.
*
* Sample Input: 
* 10 
* 3 
* 2 
* Sample Output: 
* 8 
*
* Sample Input: 
* 20 
* 7 
* 3 
* Sample Output: 
* 5
*/

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int A = scanner.nextInt();
    int B = scanner.nextInt();

    int numberOfWholeDays = (H - A) / (A - B);

    int numberOfDays = numberOfWholeDays + 1;

    int climbedHeight = numberOfWholeDays * (A - B) + A;

    if (climbedHeight < H) {
      numberOfDays++;
    }

    System.out.println(numberOfDays);
  }
}
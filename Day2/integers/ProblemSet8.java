/*
* Problem Set 8
* ==============
* You have been given the values of the two moments in time from the same 
* day both in the format: hours, minutes and seconds. It is known that the 
* second moment in time happened not earlier than the first one.
*
* Find how many seconds passed between these two moments of time.
*
* Input data format: The program gets the input of the three integers: 
* hours, minutes, seconds, defining the first moment of time, and three 
* integers that define the second moment time.
*
* Output data format: Output the number of seconds between these two moments 
* of time.
*
* Sample Input: 
* 1 
* 1 
* 1 
* 2 
* 2 
* 2 
* Sample Output: 
* 3661 
*
* Sample Input: 
* 1 
* 2 
* 30 
* 1 
* 3 
* 20 
* Sample Output: 
* 50 
*/

import java.util.Scanner;

public class ProblemSet8 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get the 1st moment in time
    int hh1 = scanner.nextInt();
    int mm1 = scanner.nextInt();
    int ss1 = scanner.nextInt();

    // Get the second moment in time
    int hh2 = scanner.nextInt();
    int mm2 = scanner.nextInt();
    int ss2 = scanner.nextInt();

    int momentOneInSeconds = ss1 + mm1 * 60 + hh1 * 3600;
    int momentTwoInSeconds = ss2 + mm2 * 60 + hh2 * 3600;

    int diff = momentTwoInSeconds - momentOneInSeconds;

    System.out.println(diff);
  }
}
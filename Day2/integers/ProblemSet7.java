/*
* Problem Set 7
* =============
* Write a program that reads a three digit number, 
* calculates the new number by reversing its digits, 
* and outputs the new number.
*
* Sample Input: 
* 907 
* Sample Output: 
* 709 
*/

import java.util.Scanner;

public class ProblemSet7 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int given = scanner.nextInt();

    int hundredth = given / 100;
    int tenth = (given - hundredth * 100) / 10;
    int ones = given - hundredth * 100 - tenth * 10;

    int newNum = ones * 100 + tenth * 10 + hundredth * 1;

    System.out.println(newNum);
  }
}
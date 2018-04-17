// Problem
// You have been given a positive real number X. Output the first digit after the decimal point.
// Sample Input:
// 1.79
// Sample Output:
// 7

import java.util.Scanner;

public class FirstDigit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	double x = input.nextDouble();
    	x = (x - (int)x) * 10;
    	System.out.println((int)x);
	}
}
/*
* Problem
* ========
* You have been given a positive real number X. Output its fractional part.
*
* Sample Input:
*
* 17.9
* Sample Output:
*
* 0.9
*/
import java.util.Scanner;

public class FractionalPart {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
      	// Get the input
      	float num = input.nextFloat();
      	System.out.println(num - (int)num);
	}
}
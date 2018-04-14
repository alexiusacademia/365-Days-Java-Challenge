import java.util.Scanner;

/* 
* Using the Scanner to read inputs
*/
public class Inputs{
	public static void main(String[] args){
		// Declare instance of Scanner
		Scanner scn = new Scanner(System.in);

		// 1. Prompt the user to enter a number
		System.out.print("Enter a number: ");
		// 2. Get the user input
		float num1 = scn.nextFloat();

		// Repeat step 1 and 2
		System.out.print("Enter another number: ");
		float num2 = scn.nextFloat();

		// Print the sum
		System.out.println("The sum of the numbers is " + (num1 + num2));
	}
}
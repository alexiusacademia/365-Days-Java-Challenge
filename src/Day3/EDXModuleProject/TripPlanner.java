package Day3.EDXModuleProject; /**
* Project module from EDX
* Trip Planner
*/

import java.util.Scanner;

public class TripPlanner {
	public static void main(String[] args) {
		// Greet the guest
		greetGuest();

		// Budget
		budgeting();
	}

	/**
	* Greets the user
	*/
	private static void greetGuest() {
		Scanner scanner = new Scanner(System.in);

		// Print the greeting
		System.out.println("Welcome to Vacation Planner!");
		System.out.print("What is your name? ");
		
		String name = scanner.nextLine();

		String greeting;

		greeting = "Nice to meedt you " + name + 
			", where are you travelling to? ";
		System.out.print(greeting);

		String placeOfTravel = scanner.nextLine();

		greeting = "Great! " + placeOfTravel + " sounds like a great trip.";
		System.out.println(greeting);
		System.out.println("**********\n");
	}


	private static void budgeting() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many days are you going to spend travelling? ");
		int numberOfDaysOfTravelling = scanner.nextInt();

		System.out.print("How much money, in USD, are you planning to spend on your trip? ");
		double plannedExpenses = scanner.nextDouble();

		System.out.print("What is the three letter currency symbol for your travel destination? ");
		String currencySymbol = scanner.nextLine();

		System.out.print("How many " + currencySymbol + 
			" are thre is 1 USD? ");
		double converter = scanner.nextDouble();


	}
}
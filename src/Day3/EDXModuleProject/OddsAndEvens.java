package Day3.EDXModuleProject;import java.util.*;

public class OddsAndEvens {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Let's play a game called \"Odds and Evens\"");
    
    // Get the user's name
    System.out.print("What is your name? ");
    String name = input.nextLine();

    // Greet the user
    System.out.println("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
    String chosen = input.nextLine();

    // Player bet
    boolean isEven = false;

    if (chosen.equals("O")) {
      System.out.println(name + " has picked odds! The computer will be evens.");
    } else if (chosen.equals("E")) {
      isEven = true;
      System.out.println(name + " has picked evens! The computer will be odds.");
    } else {
      System.out.println("Oops! That option is not in the game.");
    }

    System.out.println("- - - - - - - - - - - - - - - -");

    // Ask the user how many fingers they wanna play
    System.out.print("How many \"fingers\" do you put out? ");
    int playerFingers = input.nextInt();

    Random rand = new Random();
    int computerFingers = rand.nextInt(6);
    
    System.out.println("The computer plays " + computerFingers + " fingers.");
    System.out.println("- - - - - - - - - - - - - - - -");

    int sum = playerFingers + computerFingers;

    System.out.println(playerFingers + " + " + computerFingers + " = " + sum);

    // Odd or even
    boolean playerWins;
    String result = "";
    if (sum % 2 == 0) {
      if (isEven) {
        playerWins = true;
      } else {
        playerWins = false;
      }
      result = "even";
    } else {
      if (!isEven) {
        playerWins = true;
      } else {
        playerWins = false;
      }
      result = "odd";
    }

    System.out.println(sum + " is " + result);

    if (playerWins) {
      System.out.println("You win!");
    } else {
      System.out.println("You lose!");
    }

    System.out.println("- - - - - - - - - - - - - - - -");
  }
}
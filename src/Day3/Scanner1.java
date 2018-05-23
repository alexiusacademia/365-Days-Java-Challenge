package Day3;import java.util.Scanner;

public class Scanner1{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What color do you want? ");
        
        String shortHand = scanner.next();
        String color = "";
        
        if (shortHand.equals("B") || shortHand.equals("b")) {
            color = "Blue";
        } else if (shortHand.equals("G") || shortHand.equals("g")) {
            color = "Green";
        } else if (shortHand.equals("R") || shortHand.equals("r")) {
            color = "Red";
        } else {
            color = "Unknown";
        }
        
        if (color == "Unknown") {
            System.out.println("Unknown color: " + shortHand);
        } else {
            System.out.println("You have chosen " + color + ".");
        }
     }
}
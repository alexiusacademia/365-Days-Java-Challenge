// Demonstrate client application that sends a number to the server and the
// prints the result given by the server
import java.util.Scanner;
import java.net.*;
import java.io.*;

public class ClientSample {
  public static void main(String[] args) throws UnknownHostException, IOException {
    int num, result;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    num = input.nextInt();

    Socket clientSocket = new Socket("localhost", 1218);

    // Scanner for the input from the server
    Scanner resultFromServer = new Scanner(clientSocket.getInputStream());

    // Printstream : take the input from the user and send to server
    PrintStream ps = new PrintStream(clientSocket.getOutputStream());
    ps.println(num);

    // Get the result from the server when the server is dome processing
    result = resultFromServer.nextInt();

    System.out.println("The server returned " + result);
  }
}

// Demonstrates server application that gets a number sent by a client,
// doubles it, then send it back to the client

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServerSample {
  public static void main(String[] args) throws IOException {
    // Create a server socket
    ServerSocket serverSocket = new ServerSocket(1218);

    // Get the socket from a client request
    Socket clientSocket = serverSocket.accept();

    // Create a scanner to get the data sent by the client
    Scanner input = new Scanner(clientSocket.getInputStream());

    int num = input.nextInt();

    // Double the number and send the result to the client
    num *= 2;

    PrintStream ps = new PrintStream(clientSocket.getOutputStream());
    ps.println(num);
  }
}

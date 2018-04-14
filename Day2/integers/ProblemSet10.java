/*
* Problem Set 10
* ===============
* Some schools have decided to create three new math groups and equip the 
* classrooms for them with the new desks. Only two students may sit at any 
* one desk. The number of students in each of the three groups is known. 
* Output the smallest amount of desks, which will need to be purchased. 
* Each new group sits in its own classroom.
*
* Input data format: The program receives the input of the three non-negative 
* integers: the number of students in each of the three classes 
* (the numbers do not exceed 1000).
*
* Sample Input: 
* 20 
* 21 
* 22 
* Sample Output: 
* 32 
*
* Sample Input: 
* 16 
* 18 
* 20 
* Sample Output: 
* 27 
*/

import java.util.Scanner;

public class ProblemSet10 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get inputs from the user
    int studentsAtRoom1 = scanner.nextInt();
    int studentsAtRoom2 = scanner.nextInt();
    int studentsAtRoom3 = scanner.nextInt();

    int desksAtRoom1 = studentsAtRoom1 / 2 + studentsAtRoom1 % 2;
    int desksAtRoom2 = studentsAtRoom2 / 2 + studentsAtRoom2 % 2;
    int desksAtRoom3 = studentsAtRoom3 / 2 + studentsAtRoom3 % 2;

    int sumOfDesks = desksAtRoom1 + desksAtRoom2 + desksAtRoom3;

    System.out.println(sumOfDesks);
  }
}
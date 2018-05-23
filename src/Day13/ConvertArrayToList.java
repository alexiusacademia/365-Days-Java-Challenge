package Day13;/*
* Problem
* =========
* Given a sequence of strings separated by spaces. Read the sequence from the standard input and store all strings to the list. Output the list to the standard output using System.out.println(yourList). The order of elements must be the same as in the input.
* Sample Input:
*
* Google Oracle JetBrains
* Sample Output:
*
* [Google, Oracle, JetBrains]
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class ConvertArrayToList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = input.nextLine().split(" ");

		List<String> myList = Arrays.asList(words);
		System.out.println(myList);
	}
}
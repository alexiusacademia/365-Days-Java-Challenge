/*
* Problem
* ========
* Given a string consisting of brackets, write a program to examine whether the 
* pairs and the orders of "{", "}", "(", ")", "[", "]" are correct (balanced). 
* For example, the program should print true for the string [()]{}{[()()]()} and 
* false for ()[]}.
*
* The classic algorithm for solving this problem relies on using a stack.
*
* create an instance of a stack;
* traverse the input string;
* if the current character is a starting bracket "(" or "{" or "{" then push it to the stack;
* if the current is a closing bracket ")" or "}" or "]" then remove (pop) the top element from the stack; if the popped bracket is the matching starting bracket then fine else parenthesis are not balanced;
* after completing traversal, if there are some starting brackets left in the stack, then the parenthesis are not balanced.
* Sample Input:
*
* ([][])
* Sample Output:
*
* true
*/

import java.util.Stack;
import java.util.Scanner;
import java.util.Arrays;

public class StackSample {
	public static void main(String[] args) {
		// Get the input string from the user
		Scanner scanner = new Scanner(System.in);

		String[] arguments = scanner.nextLine().split("");

		Stack<String> chars = new Stack<>();
		
		for (String s : arguments) {
			if (isOpening(s)) {
				chars.push(s);
			} else {
				if (!chars.empty()) {
					if (isMatched(chars.peek(), s)) {
						chars.pop();
					} else {
						chars.push(s);
					}
				} else {
					if (!isOpening(s)) {
						chars.push(s);
					}
				}
			}
		}

		System.out.println(chars.empty());
	}

	private static boolean isOpening(String a) {
		if (a.equals("(") || a.equals("[") || a.equals("{")) {
			return true;
		}
		return false;
	}

	private static boolean isMatched(String a, String b) {
		if (a.equals("(") && b.equals(")")) {
			return true;
		}
		if (a.equals("[") && b.equals("]")) {
			return true;
		}
		if (a.equals("{") && b.equals("}")) {
			return true;
		}
		return false;
	}
}
/*
* Problem
* ========
* Write a program that reads the input elements and outputs them in the reverse order.
*
* The first string contains the number of elements. 
* Each line followed the first one contains an element.
* Sample Input:
*
* 3
* 1
* 2
* 3
* Sample Output:
*
* 3
* 2
* 1
*/

import java.util.*;

public class QueueAndStack {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfElements = scanner.nextInt();

		Deque<Integer> nums = new ArrayDeque<>();
		for (int i = 0; i < numberOfElements; i++) {
			nums.add(scanner.nextInt());
		}

		for (int i = 0; i < numberOfElements; i++) {
			System.out.println(nums.removeLast());
		}
	}
}
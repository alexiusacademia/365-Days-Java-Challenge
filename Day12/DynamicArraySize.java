/*
* Problem
* =========
* Write a program that reads the list of integer number separated by spaces 
* from the standard input and then remove all numbers with even indexes (0, 2, 4, and so on). 
* After, the program should output the result sequence in the reverse order.
* Sample Input:
*
* 1 2 3 4 5 6 7
* Sample Output:
*
* 6 4 2
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArraySize {
	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in);
		// System.out.println(inputs.hasNextInt());
		if (inputs.hasNextInt()) {
			String[] strInts = inputs.nextLine().split(" ");

			int nums[] = new int[strInts.length];

			for (int i=0; i<strInts.length; i++) {
				nums[i] = Integer.parseInt(strInts[i]);
			}

			List<Integer> arrNums = new ArrayList<>();

			for (int i=nums.length-1; i>0; i--) {
				if (nums[i] % 2 == 0) {
					arrNums.add(nums[i]);
				}
			}
			// Print the sorted list
			for (int i : arrNums) {
				if (arrNums.lastIndexOf(i) == arrNums.size()-1) {
					System.out.print(i);	
				} else {
					System.out.print(i + " ");
				}
			}
		}
	}
}
package Day12;/*
* Problem
* =========
* Create ArrayList by name list in any way known to you and fill it with the 
* following four numbers 2, 0, 1, 7.
* The code for displaying the list is already written.
*
* Sample Input:
*
* Sample Output:
* [2, 0, 1, 7]
*/

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(7);

    	System.out.println(list);
  	}
}
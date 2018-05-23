package Day13;import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ArrayListComparison {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		List<Integer> list2 = new LinkedList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);

		List<Integer> list3 = new ArrayList<>();
		list3.add(3);
		list3.add(1);
		list3.add(2);

		System.out.println(list1.equals(list3));	// false
		System.out.println(list1.equals(list2));	// true
		System.out.println(list1.equals(list1));	// true
		System.out.println(list3.equals(list2));	// false
	}
}
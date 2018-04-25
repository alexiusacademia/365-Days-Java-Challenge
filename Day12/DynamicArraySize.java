import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DynamicArraySize {
	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in);
		if (inputs.hasNext()) {
			String[] strInts = inputs.nextLine().split(" ");

			List<Integer> arrNums = new ArrayList<>();

			for (int i=0; i<strInts.length; i++) {
                if (i % 2 != 0) {
                    arrNums.add(Integer.parseInt(strInts[i]));
                }
			}

			// Print the sorted list
			for (int i=arrNums.size()-1; i>=0; i--) {
				if (i == 0) {
					System.out.print(arrNums.get(i));	
				} else {
					System.out.print(arrNums.get(i) + " ");
				}
			}
		}
	}
}
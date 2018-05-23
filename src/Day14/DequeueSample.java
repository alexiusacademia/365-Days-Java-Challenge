package Day14;import java.util.*;

public class DequeueSample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfElements = scanner.nextInt();

		Deque<Integer> integers = new ArrayDeque<>();

		for (int i=0; i<numberOfElements; i++) {
			integers.add(scanner.nextInt());
		}

		System.out.println(integers);
	}
}
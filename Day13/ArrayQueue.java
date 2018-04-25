import java.util.*;

public class ArrayQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();

		queue.add(2);
		queue.add(0);
		queue.add(1);
		queue.add(7);

		System.out.println(queue);
	}
}
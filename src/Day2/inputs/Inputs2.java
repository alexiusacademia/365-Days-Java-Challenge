package Day2.inputs;import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Inputs2 {
	public static void main(String[] args) throws IOException {
		// The object for reading
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in)
			);

		System.out.print("Enter more than one integer: ");
		// Takes a string and splits with whitespace
		String[] inputs = reader.readLine().split(" ");
		int num1 = Integer.parseInt(inputs[0]);  // Convert the string to integer
		int num2 = Integer.parseInt(inputs[1]);  //    -do-

		System.out.println(num1 + ", " + num2);
	}
}
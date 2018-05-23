package Day5;import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		int tens = (num - num/100*100)/10;
		int ones = num - num/10*10;

		System.out.println(tens ^ ones);
	}
}
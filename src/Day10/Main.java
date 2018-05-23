package Day10;
public class Main {
	public static void main(String[] args) {
		Generics<String> generics = new Generics<>("Test");

		System.out.println(generics.getT());
	}
}
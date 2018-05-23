package Day2.Comments;public class JavadocComment {
	/*
	* Look at the docs directory to find a sample generated
	* Javadoc documentation in HTML
	*/
	public static void main(String[] args) {
		PrintName("John Doe");
	}

	/**
	* This is a method with javadoc
	* @param name Name the user wanted to print out.
	*/
	private static void PrintName(String name) {
		System.out.println(name);
	}
}
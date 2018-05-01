/**
* This program gets the operating system's directory separator then prints it
*/
import java.io.*;

public class FileDirectorySeparator {
	public static void main(String[] args) {
		String separator = File.separator;
		System.out.println(separator);
	}
}
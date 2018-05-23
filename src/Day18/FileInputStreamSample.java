package Day18; /**
* FileInputStream 
* Reading characters from a file using FileInputStream
*/

import java.io.FileInputStream;

public class FileInputStreamSample {
	public static void main(String[] args) {
		// Create a null FileInputStream object
		FileInputStream fis = null;
		try {
			// Create a stream from the file 'sample.txt'
			fis = new FileInputStream("sample.txt");

			// Read the file and print while there is available byte to read.
			while (fis.available() > 0) {
				char c = (char) fis.read();
				System.out.print(c);
			}

			fis.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
}
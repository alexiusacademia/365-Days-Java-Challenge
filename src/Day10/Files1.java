package Day10; /**
 * List all files in a directory
 */

import java.io.File;

public class Files1 {
	public static void main(String args[]) {
		File file = null;
		// List of file paths from the current directory
		String[] paths;		

		try {
			// Create new file object
			file = new File(".");

			// Array of files in the directory
			paths = file.list();	

			// Print all the names of paths/files
			for (String path : paths) {
				System.out.println(path);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
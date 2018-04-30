/**
* This program copies an image to a new image file
*/
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.*;

public class FileOutputStreamSample {
	public static void main(String[] args) {
		FileInputStream fis = null;
		List<Byte> bytes = new ArrayList<>();

		// Copy the contents of an image in bytes
		try {
			fis = new FileInputStream("sample_image.JPG");

			// Read all the bytes then add to bytes list
			while (fis.available() > 0) {
				bytes.add((byte)fis.read());
			}
			fis.close();
		} catch (Exception e) {
			System.out.println("An error has occured: " + e);
		}

		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("copied_image.jpg");

			for (byte b : bytes) {
				fos.write(b);
			}

			fos.close();
		} catch (Exception e) {
			System.out.println("An error has occured: " + e);
		}
	}
}
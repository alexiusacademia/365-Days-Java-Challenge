// Compress an image to a zip file
import java.io.*;
import java.util.zip.*;

public class FileCompressionSample {
	public static void main(String[] args) {
		File source = new File("image.jpg");
		File destination = new File("compressed_image.jpg.zip");
		try {
			fileCompress(source, destination);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	private static void fileCompress(File source, File destination) throws IOException {
		byte[] buffer = new byte[1024];
		// Create input stream to handle source
		FileInputStream fis = new FileInputStream(source);
		// Create output stream to handle destination
		FileOutputStream fos = new FileOutputStream(destination);

		GZIPOutputStream gzos = new GZIPOutputStream(fos);
		int read;
		while ((read = fis.read(buffer)) != -1) {
			gzos.write(buffer, 0, read);
		}

		gzos.finish();
		gzos.close();
		fos.close();
		fis.close();
	}
}
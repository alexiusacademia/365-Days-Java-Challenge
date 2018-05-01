// Decompress a file
import java.io.*;
import java.util.zip.*;

public class FileDecompressionSample {
	public static void main(String[] args) {
		File source = new File("compressed_dictionary");
		File destination = new File("decompressed_dictionary.txt");
		try {
			fileDecompress(source, destination);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	private static void fileDecompress(File source, File destination) throws IOException {
		byte[] buffer = new byte[1024];
		// Create input stream to handle source
		FileInputStream fis = new FileInputStream(source);
		GZIPInputStream gzis = new GZIPInputStream(fis);
		// Create output stream to handle destination
		FileOutputStream fos = new FileOutputStream(destination);

		int read;
		while ((read = gzis.read(buffer)) != -1) {
			fos.write(buffer, 0, read);
		}

		gzis.close();
		fos.close();
		fis.close();
	}
}
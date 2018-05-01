/**
* Uses BufferedOutputStream to create a file.
*/
import java.io.*;

public class BufferedOutputStreamSample {
	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("buffered_stream_output.dat");
			bos = new BufferedOutputStream(fos);

			String output = "This will be the output of this program.";

			byte[] out = output.getBytes();

			bos.write(out);
			bos.flush();
			bos.close();

			fos.close();

		} catch (Exception e) {
			System.out.println("An error has occurred. " + e);
		}
	}
}
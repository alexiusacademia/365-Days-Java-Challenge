import java.io.*;

public class BufferedInputStreamSample {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bin = null;
		try {
			fis = new FileInputStream("../Day18/sample.txt");
			bin = new BufferedInputStream(fis);

			while (bin.available() > 0) {
				System.out.print((char)bin.read());
			}

			fis.close();
			bin.close();
		} catch (IOException ioE) {
			System.out.println(ioE);
		}
	}
}
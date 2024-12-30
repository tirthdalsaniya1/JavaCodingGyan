package javafilehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileUsingFileInputStreamAndFileOutputStream {

	public static void main(String[] args) throws IOException {
		String sourcePath = "src/javafilehandling/FileInputAndOutputStreamDemo.txt";
		File file = new File(sourcePath);

		FileOutputStream out = new FileOutputStream(file);
		String data = "This is a sample text which someone will copy";
		// we need to send data as a byte stream so convert string to byte stream
		out.write(data.getBytes());
		out.flush();
		out.close();
		System.out.println("written on file");
		String destinationPath = "src/javafilehandling/copyfile.txt";
		FileInputStream fis = new FileInputStream(sourcePath); // For reading
		FileOutputStream fos = new FileOutputStream(destinationPath); // For writing
		int i;
		while ((i = fis.read()) != -1) {

			fos.write(i);
		}
		fis.close();
		fos.close();
		System.out.println("copied data from file done successfully");

	}

}

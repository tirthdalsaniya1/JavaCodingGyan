package javafilehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamAndFileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		String path = "src/javafilehandling/FileInputAndOutputStreamDemo.txt";
		File file = new File(path);

		FileOutputStream out = new FileOutputStream(file);
		String data = "This is a sample text written using FileOutputStream.";
		// we need to send data as a byte stream so convert string to byte stream
		out.write(data.getBytes());
		out.flush();
		out.close();
		System.out.println("written on file");
		FileInputStream input = new FileInputStream(file);
		int i;

		while ((i = input.read()) != -1) {
			System.out.print((char) i);
		}
		System.out.println();
		System.out.println("read from file done successfully");
		input.close();
	}

}

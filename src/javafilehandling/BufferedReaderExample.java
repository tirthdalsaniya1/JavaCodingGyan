package javafilehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		String userDirectory = System.getProperty("user.home");
		String path = userDirectory + "/SeleniumDemo/JavaCodingGyan/src/javafilehandling/xyz.txt";
		File file = new File(path);

		if (file.exists()) {
			try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
				String line;
				while ((line = reader.readLine()) != null) { // Read line by line
					System.out.println(line); // Print each line
				}
			} catch (IOException e) {
				System.out.println("Error while reading the file: " + e.getMessage());
			}
		} else {
			System.out.println("File does not exist.");
		}
	}

}

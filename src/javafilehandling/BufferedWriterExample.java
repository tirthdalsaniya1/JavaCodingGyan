package javafilehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) throws IOException {
		String userDirectory = System.getProperty("user.home");
		String path = userDirectory + "/SeleniumDemo/JavaCodingGyan/src/javafilehandling/Bxyz.txt";
		File file = new File(path);

		// Create file if it doesn't exist
		if (file.createNewFile()) {
			System.out.println("File created: " + file.getName());
		} else {
			System.out.println("File already exists.");
		}

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
			writer.write("My name is Anthony gonsalvis\n");
			writer.write("This is a second line.");
		} catch (IOException e) {
			System.out.println("Error while writing to the file: " + e.getMessage());
		}
	}

}

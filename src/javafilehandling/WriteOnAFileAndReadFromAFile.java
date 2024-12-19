package javafilehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOnAFileAndReadFromAFile {

	public static void main(String[] args) throws IOException {
		String userDirectory = System.getProperty("user.home");
		// change below path as per your workspace and project path
		String path = userDirectory + "/SeleniumDemo/JavaCodingGyan/src/javafilehandling/xyz.txt";
		File file = new File(path);

		System.out.println(file.createNewFile());

		if (file.exists()) {

			FileWriter writer = new FileWriter(file);

			writer.write("My name is Anthony gonsalvis");
			writer.close();

			FileReader read = new FileReader(file);

			int character;

			while ((character = read.read()) != -1) {
				System.out.print((char) character);
			}
			read.close();
		}

	}

}

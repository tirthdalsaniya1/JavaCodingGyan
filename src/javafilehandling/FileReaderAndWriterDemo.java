package javafilehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriterDemo {

	public static void main(String[] args) throws IOException {
		String path = "src/javafilehandling/FileReaderWriterDemo.txt";
		File file = new File(path);
		file.createNewFile();

		FileWriter writer = new FileWriter(path);

		writer.write("I am writing into the file and then want to read it");
		System.out.println("------File Writer Function performed successfully-------");
		writer.close();
		
		//now read the file
		FileReader reader = new FileReader(file);
		int c;

		while ((c = reader.read()) != -1) {
			System.out.print((char) c);
		}
		System.out.println();
		System.out.println("------File reader Function performed successfully--------");
		reader.close();
		
		// lets append file with some new content
		FileWriter append = new FileWriter(file, true);
		append.write("\nappend into the file");
		
		//make sure to close it immediately
		append.close();

		 // Read the appended file
        FileReader updatedReader = new FileReader(file);
		while ((c = updatedReader.read()) != -1) {
			System.out.print((char) c);
		}
		System.out.println();

		System.out.println("------File reader performed successfully after appending data------");
		updatedReader.close();

		// delete file src/javafilehandling/FileReaderWriterDemo.txt when we exit
		file.deleteOnExit();
	}

}
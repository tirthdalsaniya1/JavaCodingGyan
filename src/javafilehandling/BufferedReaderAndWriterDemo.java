package javafilehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderAndWriterDemo {

	public static void main(String[] args) throws IOException {
		String path = "src/javafilehandling/BufferedReaderWriterDemo.txt";
		// create file class object and then create new file
		File file = new File(path);
		file.createNewFile();
		// Create FileWrite class object and pass it into BufferedWriter constructor
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter writer = new BufferedWriter(fileWriter);

		writer.write("I am writing into the file and then want to read it");
		System.out.println("------Buffered File Writer Function performed successfully-------");
		writer.close();

		// now read the file using BufferedReader
		FileReader reader = new FileReader(file);

		BufferedReader bufferedReader = new BufferedReader(reader);
		bufferedReader.readLine();

		System.out.println();
		System.out.println("------BufferedReader performed successfully--------");
		reader.close();

		// delete file src/javafilehandling/BufferedReaderWriterDemo.txt when we exit
		file.deleteOnExit();

	}

}
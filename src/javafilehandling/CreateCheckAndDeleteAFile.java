package javafilehandling;

import java.io.File;
import java.io.IOException;

public class CreateCheckAndDeleteAFile {

	public static void main(String[] args) throws IOException {
		String userDirectory = System.getProperty("user.home");
		//change below path as per your workspace and project path
		String path = userDirectory + "/SeleniumDemo/JavaCodingGyan/src/javafilehandling/abc.txt";
		File file = new File(path);

		System.out.println(file.createNewFile());
		System.out.println(file.exists());
		System.out.println(file.delete());
	}

}

package javaconcept2;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("C:\\Users\\w116103\\SeleniumDemo\\Java\\src\\javaconcept2\\file.txt")) {
			int c;
			while ((c = fr.read()) != -1) {
				char ch = (char) c;
				System.out.println(ch);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}

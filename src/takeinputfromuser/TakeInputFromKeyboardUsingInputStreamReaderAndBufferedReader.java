package takeinputfromuser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeInputFromKeyboardUsingInputStreamReaderAndBufferedReader {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		// Read a character
		System.out.println("--------------enter any character :");

		char c = (char) br.read();
		// To Allow multiple input we need to write br.readLine() to Consume the
		// leftover newline character
		br.readLine();

		System.out.println("entered char is : " + c);

		// Read a string
		System.out.println("---------------enter any string :");
		String s = br.readLine();
		System.out.println("entered string is " + s);

		// Read a integer
		System.out.println("---------------enter any first int number : ");
		int i = Integer.parseInt(br.readLine());
		System.out.println("---------------entered first number is : " + i);

		System.out.println("----------------enter any second int number : ");
		int i1 = Integer.parseInt(br.readLine());
		System.out.println("entered second number is : " + i1);
		System.out.println(" sum of first and second number is : " + (i + i1));

		// Read a flot
		System.out.println("---------------enter any first float number : ");

		float f = Float.parseFloat(br.readLine());
		System.out.println("entered float number is : " + f);
	}

}
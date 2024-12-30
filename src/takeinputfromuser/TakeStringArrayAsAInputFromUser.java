package takeinputfromuser;

import java.util.Scanner;

public class TakeStringArrayAsAInputFromUser {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Step 1: Read the size of the array
		System.out.println("Enter the number of strings:");
		int size = scanner.nextInt();
		scanner.nextLine(); // Consume the newline

		// Step 2: Create the array
		String[] array = new String[size];

		// Step 3: Read strings into the array
		System.out.println("Enter " + size + " strings:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextLine();
		}

		// Step 4: Display the array
		System.out.println("The strings in the array are:");
		for (String str : array) {
			System.out.print(str + " ");
		}

		// Close the scanner
		scanner.close();
	}

}
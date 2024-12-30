package takeinputfromuser;

import java.util.Scanner;

public class TakeIntArrayAsAInputFromUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Step 1: Read the size of the array
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();

		// Step 2: Create the array
		int[] array = new int[size];

		// take input from the user
		System.out.println("enter " + size + " diff int value in the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		// Step 4: Display the array
		System.out.println("The elements of the array are:");
		for (int element : array) {
			System.out.print(element + " ");
		}

		// Close the scanner
		sc.close();

	}

}

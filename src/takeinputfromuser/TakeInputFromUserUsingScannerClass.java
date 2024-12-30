package takeinputfromuser;

import java.util.Scanner;

public class TakeInputFromUserUsingScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Read a string

		System.out.println("enter string : ");
		String s = sc.nextLine();

		System.out.println("Entered string is : " + s);

		// Read a int
		System.out.println("enter int : ");

		int i = sc.nextInt();
		System.out.println("Entered int is : " + i);

		// Reading a double
		System.out.println("Enter your height (in cm):");
		double height = sc.nextDouble(); // Reads a double
		System.out.println("Your height is: " + height + " cm");

		// Reading a boolean
		System.out.println("Are you a student? (true/false):");
		boolean isStudent = sc.nextBoolean(); // Reads a boolean
		System.out.println("you are a student: " + isStudent);

		// Closing the scanner
		sc.close();
	}

}

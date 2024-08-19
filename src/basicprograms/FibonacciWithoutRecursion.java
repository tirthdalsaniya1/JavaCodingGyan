package basicprograms;

public class FibonacciWithoutRecursion {

	// WAP to print first 10 number of fibonacci series >> 0 1 1 2 3 5 8 13 21 34
	
	/*
	 * In fibonacci series, next number is the sum of previous two numbers for
	 * example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
	 * The first two numbers of fibonacci series are 0 and 1.
	 */

	public static void main(String[] args) {

		// Use first two number as a variable
		int n1 = 0, n2 = 1;

		// Use N as a variable to provide count of number
		int N = 10;

		// Print first two number 0 and 1
		System.out.print(n1 + " " + n2);

		for (int i = 0; i < N; i++) {
			int n3 = n1 + n2;

			// Print next 8 digits
			System.out.print(" " + n3);

			// Swap numbers
			n1 = n2;
			n2 = n3;
		}

	}

}
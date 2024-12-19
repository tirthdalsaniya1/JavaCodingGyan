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

        // Use N to define how many numbers in the series you want to generate
		int N = 10;

		// Print first two number 0 and 1
		System.out.print(n1 + " " + n2);
		
        // Loop to generate the next (N - 2) numbers since first two are already printed
		for (int i = 2; i < N; i++) {
			int n3 = n1 + n2;

			// Print next 8 digits
			System.out.print(" " + n3);

			// Swap numbers
			n1 = n2;
			n2 = n3;
		}

	}

}
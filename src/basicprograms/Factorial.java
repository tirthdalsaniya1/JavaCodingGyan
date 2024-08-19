package basicprograms;

public class Factorial {

	/*
	 * Factorial of n is the product of all positive descending integers. 4! =
	 * 4*3*2*1 = 24
	 * You can keep formula fact = fact*i in mind.
	 */
	public static void main(String[] args) {

		int n = 5;
		int factorial = 1;
		for (int i = 1; i <= n; i++) {

			factorial = factorial * i ; //1,  1*2, 2*3, 6*4
		}

		System.out.println(factorial);
	}

}

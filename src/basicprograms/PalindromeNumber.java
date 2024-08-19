package basicprograms;

public class PalindromeNumber {
	/*
	 * A palindrome number is a number that is same after reverse. For example 545,
	 * 151, 34543, 343, 171, 48984 are the palindrome numbers. It can also be a
	 * string like LOL, MADAM etc.
	 */
	public static void main(String[] args) {

		int num = 121; int originalNum = num;
		int rev = 0;
		while (num > 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		if (originalNum == rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");

		}

	}

}

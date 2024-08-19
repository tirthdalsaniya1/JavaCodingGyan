package javaprograms;

public class PalindromeNumber2 {

	public static void main(String[] args) {
		int r, sum = 0;
		int temp;
		int n = 1110;// It is the number variable to be checked for palindrome

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println(temp + " is palindrome number ");
		else
			System.out.println(temp + " is not palindrome");
	}
}
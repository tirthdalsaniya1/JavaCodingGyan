package stringprograms;

public class PalindromeString {

	public static void main(String[] args) {

		String str = "ABAD";

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		System.out.println(reverse);

		if (str.equals(reverse)) {
			System.out.println("string is a palindrome");
		}
	}

}

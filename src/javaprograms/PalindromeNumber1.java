package javaprograms;

public class PalindromeNumber1 {

	public static void main(String[] args) {

		int number = 121;

		String str = Integer.toString(number);

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		if (str.equals(rev)) {
			System.out.println(str + " is palindrome number");
		} else {
			System.out.println(str + " is not palindrome number");

		}

	}

}

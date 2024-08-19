package stringprogramstpoint;

public class CheckStringIsAPalindromeOrNot {

	static boolean isPalindrome(String s) {
		String newstr = s.toLowerCase();
		String rev = "";
		for (int i = newstr.length() - 1; i >= 0; i--) {

			rev = rev + newstr.charAt(i);

		}
		System.out.println("reverse string is " + rev);

		if (rev.equals(newstr)) {
			System.out.println("string is a plindrome");
			return true;
		} else {
			System.out.println("not plindrome");
			return false;

		}

	}

	public static void main(String[] args) {
		String s = "Kayak";
		boolean flag = isPalindrome(s);
		System.out.println(flag);
	}

}
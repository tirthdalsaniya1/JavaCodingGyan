package stringprogramstpoint;

public class FindSmallestAndBiggestPalindromeFromAString {

	public static void main(String[] args) {
		String string = "Wow you own kayak ";

		string = string.toLowerCase();

		String[] str = string.split(" ");

		String smallestPalindrome = "";
		String largestPalindrome = "";

		int smallestLen = Integer.MAX_VALUE;
		int largestLen = Integer.MIN_VALUE;

		for (String s : str) {
			String rev = "";
			boolean isPalindrome = false;
			for (int i = s.length() - 1; i >= 0; i--) {
				rev = rev + s.charAt(i);
			}
			if (rev.equals(s)) {
				isPalindrome = true;
				System.out.println(s + " is palindrome");

				if (s.length() > largestLen) {
					largestLen = s.length();
					largestPalindrome = s;
				}
				if (s.length() < smallestLen) {
					smallestLen = s.length();
					smallestPalindrome = s;
				}

			} else {
				System.out.println(s + " is not palindrome");
			}

		}
		System.out.println("largestPalindrome is " + largestPalindrome + " with length " + largestLen);
		System.out.println("smallestPalindrome is " + smallestPalindrome + " with length " + smallestLen);

	}

}
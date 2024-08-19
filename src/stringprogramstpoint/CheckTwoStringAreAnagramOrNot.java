package stringprogramstpoint;

import java.util.Arrays;

public class CheckTwoStringAreAnagramOrNot {

	public static void main(String[] args) {

		/*
		 * Two Strings are called the anagram if they contain the same characters.
		 * However, the order or sequence of the characters can be different.
		 */

		String str1 = "Brag";
		String str2 = "Grab";

		if (str1.length() != str2.length()) {
			System.out.println("not anagram");
		} else {

			char[] s1 = str1.toLowerCase().toCharArray();
			char[] s2 = str2.toLowerCase().toCharArray();

			Arrays.sort(s2);
			Arrays.sort(s1);

			boolean isEqual = Arrays.equals(s1, s2);
			if (isEqual == true) {
				System.out.println("is anagram");
			} else {
				System.out.println("not anagram");

			}
		}
	}

}

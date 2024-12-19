package stringprograms;

import java.util.HashSet;

public class FindAllPalindromicSubString {

	public static void main(String[] args) {

		/*
		 * Given a string, find all substrings that are palindromes. • Example: o Input:
		 * s = "abacdc" o Output: ["aba", "cdc"]
		 * 
		 */

		String s = "abacdc";
		int l = s.length();
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < l; i++) {

			for (int j = i + 1; j <= l; j++) {
				String subString = s.substring(i, j);
				set.add(subString);
				// System.out.println(subString);
			}
		}

		for (String subString : set) {
			String rev = "";
			for (int i = subString.length() - 1; i >= 0; i--) {
				rev = rev + subString.charAt(i);
			}

			if (subString.equals(rev)) {
				System.out.println(subString + " is a palindrome");
			}

		}

	}

}
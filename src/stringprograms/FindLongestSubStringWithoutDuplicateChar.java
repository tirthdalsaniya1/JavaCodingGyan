package stringprograms;

import java.util.HashSet;

public class FindLongestSubStringWithoutDuplicateChar {

	public static void main(String[] args) {
		String s = "abcdabcde";
		// Find longest substring without duplicate char

		HashSet<Character> set = new HashSet<>();
		String longestTillNowSubString = "";
		String longestEverSubString = "";
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (!set.contains(c)) {
				set.add(c);
				longestTillNowSubString = longestTillNowSubString + c;

				if (longestTillNowSubString.length() > longestEverSubString.length()) {
					longestEverSubString = longestTillNowSubString;
				}
			} else {
				set.clear();
				longestTillNowSubString = "";
				longestTillNowSubString = longestTillNowSubString + c;
				set.add(c);
			}
		}

		System.out.println(longestEverSubString);

	}

}

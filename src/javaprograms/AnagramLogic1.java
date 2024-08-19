package javaprograms;

import java.util.Arrays;

public class AnagramLogic1 {

	static Boolean isAnagram(String str1, String str2) {

		boolean result = false;
		int length1 = str1.replaceAll(" ", "").length();
		int length2 = str2.replaceAll(" ", "").length();

		if (length1 != length2) {

			result = false;
			return result;
		} else {
			char[] charArray1 = str1.replaceAll(" ", "").toLowerCase().toCharArray();
			char[] charArray2 = str2.replaceAll(" ", "").toLowerCase().toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			result = Arrays.equals(charArray1, charArray2);

			return result;
		}

	}

	public static void main(String[] args) {

		boolean result = isAnagram("abcd", "bcda");
		boolean result1 = isAnagram("Mother In Law", "Hitler Woman");
		boolean result2 = isAnagram("abcv", "bcda");

		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}

}
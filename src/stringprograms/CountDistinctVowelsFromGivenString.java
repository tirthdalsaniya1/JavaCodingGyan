package stringprograms;

import java.util.HashSet;

public class CountDistinctVowelsFromGivenString {

	public static void main(String[] args) {
		// count distinct vowels from the given string
		String s1 = "hello beautiful world";
		String s = s1.toLowerCase().replaceAll(" ", "");
		int l = s.length();

		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < l; i++) {

			char c = s.charAt(i);

			if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {

				set.add(c);
			}

		}

		System.out.println(set);
		System.out.println(set.size());

	}

}
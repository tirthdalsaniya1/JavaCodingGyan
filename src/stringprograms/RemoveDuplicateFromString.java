package stringprograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {

		String str = "java java";

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			set.add(c);

		}

		for (Character c : set) {
			result.append(c);
		}
		System.out.println(result);
	}

}
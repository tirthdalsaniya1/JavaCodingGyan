package arrayprograms;

import java.util.Arrays;

public class SortArrayElementsBasedOnTheLength {

	public static void main(String[] args) {
		String[] s = { "123", "asdf", "rtyuiio", "qw" };
		// sort array based on the length of the elements

		for (int i = 0; i < s.length; i++) {

			for (int j = i + 1; j < s.length; j++) {

				if (s[i].length() > s[j].length()) {

					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(s));

	}

}

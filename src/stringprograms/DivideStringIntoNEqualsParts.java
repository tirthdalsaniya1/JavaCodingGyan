package stringprograms;

import java.util.Arrays;

public class DivideStringIntoNEqualsParts {
	
	
	public static void main(String[] args) {

		String s = "abcdefiom";
		int nParts = 3;

		int newLength = s.length() / nParts;

		String[] stringArray = new String[nParts];

		int arrayIndex = 0;

		// Divide String into N equal parts

		if (nParts <= s.length() && s.length() % nParts == 0) {

			for (int i = 0; i < s.length(); i = i + newLength) {
				String parts = s.substring(i, i + newLength);
				stringArray[arrayIndex] = parts;
				arrayIndex++;
			}
			System.out.println(Arrays.toString(stringArray));

		} else {
			System.out.println("can not divide string into n equal parts");
		}
	}


}
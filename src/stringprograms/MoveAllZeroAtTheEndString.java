package stringprograms;

public class MoveAllZeroAtTheEndString {
	/*
	 * For a given string move all zero at the end of the string Input >>
	 * 102030405060 Output >> 123456000000
	 */

	public static void main(String[] args) {
		String input = "102030405060";
		StringBuilder result = new StringBuilder();
		int zeroCount = 0;

		// Move all non-zero characters to the front
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (currentChar != '0') {
				result.append(currentChar);
			} else {
				zeroCount++;
			}
		}

		// Append zeros to the end
		for (int i = 0; i < zeroCount; i++) {
			result.append('0');
		}

		System.out.println("Input string with zeros moved to the end: " + result);
	}
}

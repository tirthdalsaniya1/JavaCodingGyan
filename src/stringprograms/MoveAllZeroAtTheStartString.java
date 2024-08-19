package stringprograms;

public class MoveAllZeroAtTheStartString {
	/*
	 * For a given string move all zero at the start of the string Input >>
	 * 102030405060 Output >> 000000123456
	 */

	public static void main(String[] args) {
		String input = "102030405060";
		StringBuilder result = new StringBuilder();
		int zeroCount = 0;

		// Append zeros to the beginning
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (currentChar == '0') {
				result.append('0');
				zeroCount++;
			}
		}

		// Append non-zero characters after zeroes
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (currentChar != '0') {
				result.append(currentChar);
			}
		}
		System.out.println("Input string with zeros moved to the start: " + result);
	}
}

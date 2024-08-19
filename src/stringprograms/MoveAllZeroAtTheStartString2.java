package stringprograms;
public class MoveAllZeroAtTheStartString2 {
	/*
	 * For a given string move all zero at the start of the string Input >>
	 * 102030405060 Output >> 000000123456
	 */

	public static void main(String[] args) {
		String input = "102030405060";
		StringBuilder result = new StringBuilder();
		int zeroCount = 0;

		// Count the number of zeros
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '0') {
				zeroCount++;
			}
		}

		// Append zeros to the beginning
		for (int i = 0; i < zeroCount; i++) {
			result.append('0');
		}

		// Append non-zero characters
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != '0') {
				result.append(input.charAt(i));
			}
		}

		System.out.println("Input string with zeros moved to the start: " + result);
	}
}
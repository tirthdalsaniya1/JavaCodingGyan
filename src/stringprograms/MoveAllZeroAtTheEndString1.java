package stringprograms;

public class MoveAllZeroAtTheEndString1 {
	/*
	 * For a given string move all zero at the end of the string 
	 * Input >> 102030405060 Output >> 123456000000
	 */
	public static void main(String args[]) {

		String input = "102030405060";
		StringBuilder outputStr = new StringBuilder();

		// add nonzero at the start of the string
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != '0') {

				outputStr.append(input.charAt(i));
			}
		}
		// Append zeroes after non zeroes
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '0') {

				outputStr.append(input.charAt(i));
			}
		}

		System.out.println("Input string with zeros moved to the end: " + outputStr);
	}
}

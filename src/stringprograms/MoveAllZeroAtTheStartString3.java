package stringprograms;
public class MoveAllZeroAtTheStartString3 {
	public static void main(String args[]) {
		/*
		 * For a given string move all zero at the start of the string 
		 * Input >> 102030405060 Output >> 000000123456
		 */
		String input = "102030405060";
		StringBuilder numStr = new StringBuilder();
		StringBuilder zeroStr = new StringBuilder();

		// add zero at the start of the string
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '0') {
				zeroStr.append(input.charAt(i));
			} else {
				numStr.append(input.charAt(i));
			}
		}
		System.out.println(zeroStr.append(numStr)); // 000000123456

	}
}
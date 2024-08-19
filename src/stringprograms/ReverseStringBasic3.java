package stringprograms;

public class ReverseStringBasic3 {

	public static String reverseTwoCharacters(String str, int index1, int index2) {
		if (str == null || str.length() < Math.max(index1, index2) + 2 || index1 < 0 || index2 < 0) {
			return str; // return original string if indices are out of bounds or string is null
		}

		char[] charArray = str.toCharArray();

		// Swap characters at index1 and index2
		char temp = charArray[index1];
		charArray[index1] = charArray[index2];
		charArray[index2] = temp;

		return new String(charArray);
	}

	public static void main(String[] args) {
		String input = "abcdef";
		int index1 = 0;
		int index2 = 1;
		String output = reverseTwoCharacters(input, index1, index2);
		System.out.println("Reversed String: " + output);
	}
}

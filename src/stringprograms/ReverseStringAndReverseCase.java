package stringprograms;

public class ReverseStringAndReverseCase {

	public static void main(String[] args) {
		String input = "My name is Tirth"; // tIRTH IS NAME mY
		String reversed = reverseString(input);
		System.out.println(reversed);
	}

	public static String reverseString(String str) {
		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			result.append(reverseCase(words[i]));
			if (i > 0) {
				result.append(" ");
			}
		}
		return result.toString();
	}

	public static String reverseCase(String word) {
		StringBuilder reversedWord = new StringBuilder();
		for (char c : word.toCharArray()) {
			if (Character.isUpperCase(c)) {
				reversedWord.append(Character.toLowerCase(c));
			} else if (Character.isLowerCase(c)) {
				reversedWord.append(Character.toUpperCase(c));
			} else {
				reversedWord.append(c);
			}
		}
		return reversedWord.toString();
	}
}

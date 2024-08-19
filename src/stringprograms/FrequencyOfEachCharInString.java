package stringprograms;

public class FrequencyOfEachCharInString {

	public static void main(String[] args) {
		// String to count character frequencies
		String str = "ABCAMNA";

		int[] frequency = new int[26]; // Assuming only lowercase alphabets, change size for uppercase or
										// case-insensitive counting

		// Count the frequency of each letter
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				frequency[Character.toLowerCase(ch) - 'a']++;
			}
		}

		// Display the frequency of each letter
		for (int i = 0; i < 26; i++) {
			if (frequency[i] != 0) {
				char ch = (char) (i + 'a');
				System.out.println(ch + ": " + frequency[i]);
			}
		}

	}
}

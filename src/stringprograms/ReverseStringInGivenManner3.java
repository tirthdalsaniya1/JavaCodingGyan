package stringprograms;

public class ReverseStringInGivenManner3 {

	public static void main(String[] args) {
		/*
		 * Reverse Given String Input > My.name.is.Tirth Output > yM eman si htriT
		 */

		String input = "My.name.is.Tirth";
		String[] words = input.split("\\.");
		StringBuilder reversed = new StringBuilder();

		// Iterate through the words in reverse order
		for (int i = 0; i < words.length; i++) {
			// Reverse each individual word
			for (int j = words[i].length() - 1; j >= 0; j--) {
				reversed.append(words[i].charAt(j));
			}
			reversed.append(" ");
		}
		System.out.println("Output: " + reversed);

	}
}

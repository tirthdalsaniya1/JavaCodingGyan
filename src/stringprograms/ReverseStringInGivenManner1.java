package stringprograms;

public class ReverseStringInGivenManner1 {

	public static void main(String[] args) {
		/*
		 * Reverse Given String Input > My name is Tirth Output > Tirth is name My
		 */

		String input = "My name is Tirth";

		String[] words = input.split("\\s+");
		StringBuilder reversed = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]).append(" ");
		}
		System.out.println("Output: " + reversed);

	}
}

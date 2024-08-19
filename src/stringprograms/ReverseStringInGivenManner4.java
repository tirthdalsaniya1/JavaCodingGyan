package stringprograms;

public class ReverseStringInGivenManner4 {

	public static void main(String[] args) {
		/*
		 * Reverse Given String Input > My name is Tirth Output > htriT si eman yM
		 */

		String input = "My name is Tirth";
		String[] words = input.split(" ");
		StringBuilder reversed = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			for (int j = words[i].length() - 1; j >= 0; j--) {
				reversed.append(words[i].charAt(j));
			}
			if (i != 0) {
				reversed.append(" ");
			}
		}

		System.out.println("Output: " + reversed);
		System.out.println("input length " + input.length());
		System.out.println("output length " + reversed.length());
	}
}

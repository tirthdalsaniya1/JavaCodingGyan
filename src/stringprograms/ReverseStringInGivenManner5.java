package stringprograms;

public class ReverseStringInGivenManner5 {

	public static void main(String[] args) {
		/*
		 * Reverse Given String Input > i.like.this.program.very.much Output >
		 * much.very.program.this.like.i
		 */

		String input = "i.like.this.program.very.much";
		String[] words = input.split("\\.");
		StringBuilder reversed = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {

			if (i != 0) {
				reversed.append(words[i]+".");
			}
			if (i == 0) {
				reversed.append(words[i]);
			}
		}

		System.out.println("Output: " + reversed);
		System.out.println("input length " + input.length());
		System.out.println("output length " + reversed.length());
	}
}

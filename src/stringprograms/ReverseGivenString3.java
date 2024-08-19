package stringprograms;

public class ReverseGivenString3 {

	public static void main(String[] args) {
		/*
		 * Reverse Given String Input > My name is Tirth Output > htriT si eman yM
		 */

		String input = "My name is Tirth";
		StringBuilder reversed = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed.append(input.charAt(i));
		}
		System.out.println("Output: " + reversed);
		System.out.println("input length " + input.length());
		System.out.println("output length " + reversed.length());	}
}

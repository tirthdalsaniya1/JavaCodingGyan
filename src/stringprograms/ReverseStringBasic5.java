package stringprograms;

public class ReverseStringBasic5 {

	public static void main(String[] args) {
		String input = "My name is Yogesh";
		String output = rearrangeWords(input);
		System.out.println("Input : " + input);
		System.out.println("Output: " + output);
	}

	public static String rearrangeWords(String input) {
		String[] words = input.split(" "); // split the input string into words
		if (words.length < 4) {
			return input; // if less than 4 words, return original string
		}
		String temp = words[1]; // store the second word in a temporary variable
		words[1] = words[2]; // replace the second word with the third word
		words[2] = temp; // replace the third word with the temporary variable
		return String.join(" ", words); // join the words back into a sentence
	}
}

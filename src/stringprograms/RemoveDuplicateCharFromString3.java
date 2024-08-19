package stringprograms;

public class RemoveDuplicateCharFromString3 {

	public static void main(String[] args) {
		String str = "aabcdeefgghiijkl";

		StringBuilder finalString = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (finalString.indexOf(String.valueOf(c)) == -1) {
				finalString.append(c);
			}
		}
		System.out.println(finalString);
	}
}
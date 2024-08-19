package stringprograms;

public class MoveAllSpecialCharAtEndString {

	public static void main(String[] args) {

		String str = "1!2!3!4~5@6*";

		StringBuilder finalStr = new StringBuilder();
		StringBuilder finalStr1 = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {

				finalStr.append(str.charAt(i));

			} else {
				finalStr1.append(str.charAt(i));

			}
		}
		System.out.println(finalStr.append(finalStr1));

	}

}
package stringprograms;

public class ReverseStringAndUpperToLowerAndViceVersa {

	public static void main(String[] args) {

		String input = "My name is Tirth"; // tIRTH IS NAME mY (upper to lower and vice versa)

		StringBuilder finalStr = new StringBuilder();
		String[] str = input.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			for (int j = 0; j < str[i].length(); j++) {

				char c = str[i].charAt(j);

				if (Character.isUpperCase(c)) {

					finalStr.append(Character.toLowerCase(c));
				} else {
					finalStr.append(Character.toUpperCase(c));
				}
			}
			finalStr.append(" ");
		}
		System.out.println(finalStr.toString().trim());

	}
}

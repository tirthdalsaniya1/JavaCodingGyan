package stringprograms;

public class ReverseStringAndUpperToLowerAndViceVersa2 {

	public static void main(String[] args) {

		String input = "My name is Tirth"; // tIRTH IS NAME mY (upper to lower and vice versa)

		System.out.println("size of input is " + input.length());
		StringBuilder finalStr = new StringBuilder();
		StringBuilder string = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c != ' ') {
				if (Character.isUpperCase(c)) {
					finalStr.append(Character.toLowerCase(c));
				} else {
					finalStr.append(Character.toUpperCase(c));
				}
			} else {
				finalStr.append(" ");
			}

		}

		String[] str = finalStr.toString().split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			if (i != 0) {
				string.append(str[i]);
				string.append(" ");

			} else {
				string.append(str[i]);
			}
		}

		System.out.println(string);
		System.out.println("size of output is " + string.length());

	}
}

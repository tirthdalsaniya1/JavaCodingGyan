package stringprograms;

public class PrintFirstAndLastCharOfAString {

	public static void main(String[] args) {
		String str = "Hello Good Morning World";

		// OP = HoGdMgWd

		String[] s = str.split(" ");

		for (int i = 0; i < s.length; i++) {

			for (int j = 0; j < s[i].length(); j++) {

				char c = s[i].charAt(j);

				if (j == 0 || j == s[i].length() - 1) {
					System.out.print(c);
				}

			}
		}

	}

}

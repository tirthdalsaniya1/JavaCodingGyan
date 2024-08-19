package stringprogramstpoint;

public class LowerCaseToUpperCaseAndViceVersaInString {

	public static void main(String[] args) {
		String str1 = "Great Power";

		StringBuffer str = new StringBuffer();
		for (char c : str1.toCharArray()) {

			if (Character.isLowerCase(c)) {
				str.append(Character.toUpperCase(c));
			} else {
				str.append(Character.toLowerCase(c));
			}
		}
		System.out.println(str);
	}

}

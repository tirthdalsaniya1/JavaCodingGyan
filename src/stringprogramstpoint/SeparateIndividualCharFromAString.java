package stringprogramstpoint;

public class SeparateIndividualCharFromAString {

	public static void main(String[] args) {

		String string = "characters";
		StringBuilder s = new StringBuilder();
		for (char c : string.toCharArray()) {
			s.append(c);
			s.append(" ");
		}
		System.out.println(s);

	}

}

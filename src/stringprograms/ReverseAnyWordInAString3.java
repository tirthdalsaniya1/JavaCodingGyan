package stringprograms;

public class ReverseAnyWordInAString3 {

	public static void main(String[] args) {
		String str = "my name is my name";
		StringBuilder result = new StringBuilder();

		int i1 = 0;
		int i2 = 1;
		String[] s = str.split(" ");

		if (i1 < s.length && i2 < s.length) {
			String temp = s[i1];
			s[i1] = s[i2];
			s[i2] = temp;
		}

		for (String d : s) {
			System.out.print(d);
		}
		System.out.println();

		for (int i = 0; i < s.length; i++) {
			result.append(s[i]);

			if (i != s.length - 1) {
				result.append(" ");
			}
		}

		System.out.println(result);

	}

}
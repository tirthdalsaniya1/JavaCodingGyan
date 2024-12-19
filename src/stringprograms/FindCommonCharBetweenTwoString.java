package stringprograms;

public class FindCommonCharBetweenTwoString {

	public static void main(String[] args) {
		String s1 = "Tickwood";

		String s2 = "Tickwoods";
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				char c = s1.charAt(i);

				char c2 = s2.charAt(j);
				if (c == c2) {
					System.out.print(c);
					break;

				}
			}
		}

	}

}

package stringprogramstpoint;

public class CountPunctuationMarksInAString {

	public static void main(String[] args) {
		String s = "Hello, world! How are you doing today? I'm fine, thank you.";
		int count = 0;
		for (char c : s.toCharArray()) {

			if (!((c == ' ') || ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isDigit(c)))) {
				count++;
			}
		}

		System.out.println(count);

	}

}

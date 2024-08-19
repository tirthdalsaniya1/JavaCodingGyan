package stringprogramstpoint;

public class CountPunctuationMarksInAString2 {

	public static void main(String[] args) {
		String s = " Hello, world! How are you doing today? I'm fine, thank you.";
		int count = 0;
		for (char c : s.toCharArray()) {

			if (!(Character.isLetterOrDigit(c) || Character.isWhitespace(c))) {
				count++;
			}
		}

		System.out.println(count);

	}

}

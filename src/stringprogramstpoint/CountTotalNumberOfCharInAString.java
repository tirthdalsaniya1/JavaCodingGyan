package stringprogramstpoint;

public class CountTotalNumberOfCharInAString {

	public static void main(String[] args) {
		String s = "The best of both worlds";
		int size = s.length();
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c != ' ') {

				count++;
			}
		}
		System.out.println("total char count is " + count);
		System.out.println("Space count is " + (size - count));
	}

}

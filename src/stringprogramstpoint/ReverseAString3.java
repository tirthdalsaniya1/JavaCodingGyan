package stringprogramstpoint;

public class ReverseAString3 {

	public static void main(String[] args) {

		String s = "abcdefg";
		String revStr = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			revStr = revStr + c;

		}
		System.out.println(revStr);
	}

}

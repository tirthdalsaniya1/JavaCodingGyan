package stringprogramstpoint;

public class ReverseAString2 {

	public static void main(String[] args) {

		String s = "abcdefg";
		int l = s.length();
		String revStr = "";

		while (l > 0) {
			char c = s.charAt(l - 1);
			revStr = revStr + c;
			l--;
		}

		System.out.println(revStr);
	}

}

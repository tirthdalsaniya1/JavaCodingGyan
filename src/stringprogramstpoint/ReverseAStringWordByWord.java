package stringprogramstpoint;

public class ReverseAStringWordByWord {

	public static void main(String[] args) {

		String str = "honesty is the best policy";
		// policy best the is honesty

		String[] s = str.split(" ");
		StringBuffer finalStr = new StringBuffer();
		for (int i = s.length - 1; i >= 0; i--) {

			finalStr.append(s[i]);
			if (i != 0) {
				finalStr.append(" ");
			}

		}
		System.out.println(str.length());
		System.out.println(finalStr.length());
		System.out.println(finalStr);

	}

}

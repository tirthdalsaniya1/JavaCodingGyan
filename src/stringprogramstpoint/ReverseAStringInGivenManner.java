package stringprogramstpoint;

public class ReverseAStringInGivenManner {

	public static void main(String[] args) {

		String str = "honesty is the best policy";
		// ytsenoh si eht tseb ycilop

		String[] s = str.split(" ");
		StringBuffer finalStr = new StringBuffer();
		for (int i = 0; i < s.length; i++) {
			String rev = "";

			for (int j = s[i].length() - 1; j >= 0; j--) {

				rev = rev + s[i].charAt(j);
			}
			finalStr.append(rev);
			if (i != s.length-1) {
				finalStr.append(" ");
			}

		}
		System.out.println(str.length());
		System.out.println(finalStr.length());
		System.out.println(finalStr);

	}

}

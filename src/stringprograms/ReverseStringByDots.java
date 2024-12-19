package stringprograms;

public class ReverseStringByDots {

	public static void main(String[] args) {
		/*
		 * Given a String S, reverse the string without reversing its individual words.
		 * Words are separated by dots. 
		 * Input: S = i.like.this.program.very.much 
		 * Output: much.very.program.this.like.i
		 * 
		 */

		String str = "i.like.this.program.very.much";
		String revStr[] = str.split("[.]");
		StringBuilder reversedString = new StringBuilder();
		for (int i = revStr.length - 1; i >= 0; i--) {
			reversedString.append(revStr[i]);
			if (i != 0) {
				reversedString.append(".");
			}
		}
		System.out.println(reversedString);
	}

}

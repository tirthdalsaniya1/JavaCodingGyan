package stringprogramstpoint;

public class ReplaceSpaceWithSpecificChar {

	public static void main(String[] args) {
		String str = "Once in a blue moon";
		// Output = Once-in-a-blue-moon
		char specialCharForReplace = '-';
		StringBuffer finalStr = new StringBuffer();
		for (char c : str.toCharArray()) {

			if (c == ' ') {
				finalStr.append(specialCharForReplace);
			} else {
				finalStr.append(c);

			}

		}
		System.out.println(finalStr);

	}

}

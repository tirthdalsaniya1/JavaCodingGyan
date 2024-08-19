package stringprograms;

public class RemoveDuplicateFromString2 {

	public static void main(String[] args) {
		String str = "aabcdeefgghiijkl";
		char[] charArray = str.toCharArray();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < charArray.length; i++) {
			boolean duplicate = false;

			for (int j = i + 1; j < charArray.length; j++) {

				if (charArray[i] == charArray[j] ) {
					duplicate = true;
					break;
				}

			}
			if (!duplicate) {
				result.append(str.charAt(i));
			}
		}

		System.out.println(result);
	}
}
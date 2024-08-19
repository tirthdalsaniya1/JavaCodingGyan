package stringprogramstpoint;

public class FindDuplicateCharInAString {

	public static void main(String[] args) {
		String str = "Great responsibility";
		int count;
		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			count = 1;
			for (int j = i + 1; j < charArray.length; j++) {

				if ((charArray[i] == charArray[j]) && (charArray[i] != ' ')) {
					count++;

					// Set charArray[j] to 0 to avoid printing visited character
					charArray[j] = '0';
				}
			}

			if (count > 1 && charArray[i] != '0') {
				System.out.println(charArray[i] + " occurance is " + count);
			}
		}

	}

}

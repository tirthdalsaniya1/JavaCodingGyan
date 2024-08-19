package stringprogramstpoint;

public class CountVowelsAndConsonantsInString {

	public static void main(String[] args) {

		/*
		 * As we know that, the characters a, e, i, o, u are known as vowels in the
		 * English alphabet. Any character other than that is known as the consonant.
		 * 
		 */

		String str = "This is a really simple sentence";
		String f = str.toLowerCase();
		int vCount = 0;
		int cCount = 0;
		for (char c : f.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vCount++;
			} else if (!(c == ' ') || (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
				cCount++;
			}
		}
		System.out.println("Number of vowels: " + vCount);
		System.out.println("Number of consonants: " + cCount);
	}

}

package stringprogramstpoint;

public class FindFrequencyOfWordsInAString {

	public static void main(String[] args) {
		String string = "Big black bug bit a big black dog on his big black nose";
		string = string.toLowerCase();

		String[] words = string.split(" ");
		int count;
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {

				if (words[i].equals(words[j])) {

					count++;
					words[j] = "";

				}

			}
			if (count > 1 && !words[i].equals("")) {
				System.out.println("occurance of " + words[i] + " is " + count);
			}

		}

	}

}

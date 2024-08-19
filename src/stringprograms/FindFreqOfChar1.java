package stringprograms;
public class FindFreqOfChar1 {

	public static void main(String[] args) {
		// Find the frequency of each char
		String str = "ABCAMNA";

		int[] frequency = new int[256]; // Assuming ASCII characters

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			frequency[c]++;
		}

		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] > 0) {
				System.out.println("Character: " + (char) i + ", Frequency: " + frequency[i]);
			}
		}
	}

}

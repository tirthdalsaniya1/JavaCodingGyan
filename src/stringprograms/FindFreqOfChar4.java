package stringprograms;
import java.util.HashSet;
import java.util.Set;

public class FindFreqOfChar4 {
	public static void main(String[] args) {
		// String to count character frequencies
		String str = "ABCAMNA";

        Set<Character> processedChars = new HashSet<>();
        
		for (int i = 0; i < str.length(); i++) {
			int count = 0;

			char currentChar = str.charAt(i);

			 if (processedChars.contains(currentChar)) {
	                continue;
	            }
			
			for (int j = 0; j < str.length(); j++) {
				if (currentChar == str.charAt(j)) {
					count++;
				}
			}

			System.out.println("Frequency of " + currentChar + " = " + count);
            processedChars.add(currentChar);

		}
	}
}

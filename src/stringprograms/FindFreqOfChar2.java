package stringprograms;
import java.util.HashMap;
import java.util.Map;

public class FindFreqOfChar2 {

	public static void main(String[] args) {
		// Find the frequency of each char
		String str = "ABCAMNA";

		Map<Character, Integer> frequencyMap = new HashMap<>();

		// Count the frequency of each character
		for (char c : str.toCharArray()) {
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
		}

		// Print the frequency of each character
		for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
			System.out.println("Character: " + entry.getKey() + ", Frequency: " + entry.getValue());
		}
	}

}

package stringprograms;
import java.util.HashMap;
import java.util.Map;

public class FindOccuranceOfCharInAString {
	public static void main(String[] args) {

		String str = "MynameisTirth";
		
		char[] charArray = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			} else {
				map.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
            }
        }

	}
}

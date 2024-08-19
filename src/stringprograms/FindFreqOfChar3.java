package stringprograms;
import java.util.HashSet;
import java.util.Set;

public class FindFreqOfChar3 {

	public static void main(String[] args) {
		// Find the frequency of each char
		String str = "ABCAMNA";

		Set<Character> set = new HashSet();
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			char a = 0;
			char b = 0;

			if (set.contains(str.charAt(i))) {
				continue;
			}

			for (int j = 0; j < str.length(); j++) {
				a = str.charAt(i);
				b = str.charAt(j);

				if (a == b) {
					count++;
					set.add(str.charAt(j));
				}

			}
			System.out.println("count of " + a + " is " + count);

		}

	}
}

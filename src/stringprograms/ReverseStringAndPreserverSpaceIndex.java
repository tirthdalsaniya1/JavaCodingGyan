package stringprograms;
import java.util.ArrayList;

public class ReverseStringAndPreserverSpaceIndex {

	public static void main(String[] args) {
		String input = "My name is Tirth"; // ht riTs ie manyM


		// StringBuffer to store the reversed string
		StringBuffer sb = new StringBuffer();

		// Find the indexes of space chars for input string and store inside ArrayList
		ArrayList<Integer> spaceIndex = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				spaceIndex.add(i);
			}
		}

		// Reverse the input string and append non-space characters to the StringBuffer
		for (int i = input.length() - 1; i >= 0; i--) {
			if (!spaceIndex.contains(i))
				sb.append(input.charAt(i));

		}

		// Insert space characters at the original indexes
		for (int i : spaceIndex) {
			sb.insert(i, ' '); // Insert a space character at the specified index
		}
		System.out.println(sb);
	}

}

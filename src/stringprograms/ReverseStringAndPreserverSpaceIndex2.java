package stringprograms;

import java.util.ArrayList;

public class ReverseStringAndPreserverSpaceIndex2 {

	public static void main(String[] args) {

		// My name is Tirth > ht rits ie manyM

		String s = "My name is Tirth";
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ') {
				list.add(i);
			}
		}
		System.out.println("reverse string without space "+list);
		StringBuilder str = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ')
				str.append(s.charAt(i));

		}
		for (int i = 0; i < str.length(); i++) {
			if (list.contains(i)) {
				str.insert(i, ' ');
			}
		}
		System.out.println(str);
	}

}
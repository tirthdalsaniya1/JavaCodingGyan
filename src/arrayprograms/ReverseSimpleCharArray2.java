package arrayprograms;

import java.util.ArrayList;

public class ReverseSimpleCharArray2 {

	public static void main(String[] args) {

		char[] d = { 'A', 'B', 'C', 'D', 'e' };

		ArrayList<Character> list = new ArrayList<>();

		for (int i = d.length - 1; i >= 0; i--) {
			list.add(d[i]);
		}
		System.out.println(list);

	}
}
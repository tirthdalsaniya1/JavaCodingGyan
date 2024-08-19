package arrayprograms;

import java.util.Arrays;

public class ReverseSimpleCharArray {

	public static void main(String[] args) {

		char[] d = { 'A', 'B', 'C', 'D', 'e' };
		char[] o = new char[d.length];
		int newIndex = 0;
		for (int i = d.length-1; i >=0; i--) {
			o[newIndex++] = d[i];
		}
		System.out.println(Arrays.toString(o));

	}
}
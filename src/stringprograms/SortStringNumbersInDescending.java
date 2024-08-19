package stringprograms;

public class SortStringNumbersInDescending {

	// sort string in descending
	public static void main(String[] args) {
		String input = "12387654321";

		char[] c = input.toCharArray();
		char temp;
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {

				if (c[i] < c[j]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;

				}
			}

		}
		System.out.println(new String(c));

	}
}

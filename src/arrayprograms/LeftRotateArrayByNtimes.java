package arrayprograms;

import java.util.Arrays;

public class LeftRotateArrayByNtimes {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };
		int n = 3;
		for (int j = 0; j < n; j++) {
			int firstElement = a[0];

			for (int i = 0; i < a.length - 1; i++) {

				a[i] = a[i + 1];
			}
			a[a.length - 1] = firstElement;

			System.out.println(Arrays.toString(a));
		}
	}
}

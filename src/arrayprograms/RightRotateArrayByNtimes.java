package arrayprograms;

import java.util.Arrays;

public class RightRotateArrayByNtimes {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 }; // 6,1,2,3,4,5

		int n = 3;
		for (int j = 0; j < n; j++) {
			int lastElement = a[a.length - 1];

			for (int i = a.length - 1; i > 0; i--) {

				a[i] = a[i - 1]; // 5
			}
			a[0] = lastElement;

			System.out.println(Arrays.toString(a));
		}
	}
}
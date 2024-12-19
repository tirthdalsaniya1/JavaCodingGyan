package arrayprograms;

import java.util.Arrays;

public class RemoveDuplicateAndSortTheArrayWithoutCollection2 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 1, 2, 9, 8, 9, 6, 5, 4, 11 };

		// Remove Duplicates and sort the array without using set or Sort method

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(a));
		int j = 0;
		for (int i = 1; i < a.length; i++) {

			if (a[j] != a[i]) {
				j++;
				a[j] = a[i];

			}
		}

		for (int i = 0; i <= j; i++) {
			System.out.print(a[i]);
		}
	}

}

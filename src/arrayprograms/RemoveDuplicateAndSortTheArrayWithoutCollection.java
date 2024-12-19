package arrayprograms;

public class RemoveDuplicateAndSortTheArrayWithoutCollection {

	public static void main(String[] args) {
		int[] a = { 1, 2, 1, 2, 9, 8, 9, 6, 5, 4 };

		// Remove Duplicates and sort the array without using set or Sort method

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}

		for (int i : a) {
			System.out.print(i);
		}
		System.out.println();
		// pointer to track the unique element index
		int j = 0;
		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] != a[i + 1]) {
				// Place the unique element at the tracked index
				a[j++] = a[i];
			}

		}
		// add last element
		a[j++] = a[a.length - 1];

		// Print unique elements
		for (int i = 0; i < j; i++) {
			System.out.print(a[i]);
		}

	}

}

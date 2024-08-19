package arrayprograms;

public class FindLargestNumFromIntArray {
	public static void main(String[] args) {

		// find largest int value from given array
		int[] a = { 0, 2, 1, 3, 4, 5, 6, 7, 8, 9, 10 };

		int largest = Integer.MIN_VALUE;

		for (int i : a) {

			if (i > largest) {
				largest = i;
			}

		}
		System.out.println(largest);
	}

}

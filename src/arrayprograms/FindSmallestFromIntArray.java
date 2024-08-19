package arrayprograms;

public class FindSmallestFromIntArray {
	public static void main(String[] args) {

		// find smallest int value from given array
		int[] a = { 0, 2, 1, 3, 4, 5, 6, 7, 8, 9, 10 };

		int smallest = Integer.MAX_VALUE;

		for (int i : a) {

			if (i < smallest) {
				smallest = i;
			}

		}
		System.out.println(smallest);
	}

}

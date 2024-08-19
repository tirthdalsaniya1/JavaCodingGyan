package arrayprograms;

public class RemoveZeoresFromIntArray2 {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0, 5, 0 };

		int nonZeroCount = 0;

		for (int i : arr) {
			if (i != 0) {
				nonZeroCount++;
			}
		}

		int[] finalArray = new int[nonZeroCount];
		int index = 0;
		for (int i : arr) {
			if (i != 0) {
				finalArray[index] = i;
				index = index + 1;
			}

		}

		for (int i : finalArray) {
			System.out.print(i+" ");
		}
	}
}

package arrayprograms;

public class MoveAllZeroAtTheStartOfArray {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0, 5, 0 };

		int[] newArr = new int[arr.length];
		int zeroCount = 0;

		// Count zeros to determine the starting index for non-zero elements
		for (int value : arr) {
			if (value == 0) {
				zeroCount++;
			}
		}

		int nonZeroIndex = zeroCount; // Start populating non-zeros after the zeros
		for (int value : arr) {
			if (value != 0) {
				newArr[nonZeroIndex++] = value;
			}
		}

		// Print the array with zeros at the start
		for (int num : newArr) {
			System.out.print(num + " ");
		}
	}
}
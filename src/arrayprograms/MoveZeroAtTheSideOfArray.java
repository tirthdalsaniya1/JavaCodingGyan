package arrayprograms;

public class MoveZeroAtTheSideOfArray {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0, 5, 0 };
		boolean moveZerosToStart = true; // Change this to true to move zeros to start

		int[] newArr = new int[arr.length];
		int index = 0; // Index for placing elements in newArr

		if (moveZerosToStart) {
			// Count the number of zeros first
			for (int value : arr) {
				if (value == 0) {
					index++;
				}
			}
			// Fill non-zeros after the zeros
			for (int value : arr) {
				if (value != 0) {
					newArr[index++] = value;
				}
			}
		} else {
			// Place non-zeros first
			for (int value : arr) {
				if (value != 0) {
					newArr[index++] = value;
				}
			}
			// Zeros are automatically at the end due to default initialization
		}

		// Print the resulting array
		for (int num : newArr) {
			System.out.print(num + " ");
		}
	}
}
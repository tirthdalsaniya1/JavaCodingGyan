package arrayprograms;

import java.util.Arrays;

public class MoveAllZeroAtTheStartOfArray1 {

	public static void main(String[] args) {

		// Initial array with zeros and non-zero integers
		int[] originalArray = { 1, 0, 2, 0, 3, 0, 4, 0, 5, 0 };

		// New array to store the reorganized elements
		int[] rearrangedArray = new int[originalArray.length];

		// Starting index for placing non-zero elements from the end of the array
		int insertionIndex = originalArray.length - 1;

		// Loop through the original array from end to start
		for (int i = originalArray.length - 1; i >= 0; i--) {
			// Check if current element is not zero
			if (originalArray[i] != 0) {
				// Place non-zero element at the current insertion index in the new array
				rearrangedArray[insertionIndex--] = originalArray[i];
			}
		}

		// Print the rearranged array with non-zero elements shifted to the right
		System.out.println(Arrays.toString(rearrangedArray));
	}
}
package arrayprograms;

import java.util.Arrays;

public class AddRemoveElementsFromArray {

	public static void main(String[] args) {

		int[] originalArray = { 1, 2, 3, 4, 5 };
		int newElement = 6;

		// Create a new array one element larger than the original array
		int[] newArray = new int[originalArray.length + 1];

		// Copy the original array to the new array
		System.arraycopy(originalArray, 0, newArray, 0, originalArray.length);

		// Add the new element to the end of the new array
		newArray[originalArray.length] = newElement;

		// Print the new array
		System.out.println(Arrays.toString(newArray));

		int[] originalArray2 = { 1, 2, 3, 4, 5 };
		int indexToRemove = 2; // Remove the element at index 2 (which is 3)

		// Create a new array one element smaller than the original array
		int[] newArray2 = new int[originalArray2.length - 1];

		// Copy elements before the index to remove
		System.arraycopy(originalArray2, 0, newArray2, 0, indexToRemove);

		// Copy elements after the index to remove
		System.arraycopy(originalArray2, indexToRemove + 1, newArray2, indexToRemove,
				originalArray2.length - indexToRemove - 1);

		// Print the new array
		System.out.println(Arrays.toString(newArray2));
	}

}

package arrayprograms;

public class SumOfTwoIntArray {

	public static void main(String[] args) {

		// Example arrays
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 5, 4, 3, 2, 1 };

		// Assuming both arrays are of the same length
		int length = array1.length;
		int[] sumArray = new int[length];

		// Adding corresponding elements of both arrays
		for (int i = 0; i < length; i++) {
			sumArray[i] = array1[i] + array2[i];
		}

		// Printing the result
		System.out.println("Sum of the two arrays is:");
		for (int num : sumArray) {
			System.out.print(num + " ");
		}
	}

}
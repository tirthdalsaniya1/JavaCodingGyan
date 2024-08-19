package arrayprograms;

public class MoveAllZeroAtTheEndOfArray {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0, 5, 0 };

		int[] newArr = new int[arr.length];
		int index = 0; // Index to place non-zero elements first

		// Place non-zero elements first
		for (int value : arr) {
			if (value != 0) {
				newArr[index++] = value;
			}
		}

		// Print the array with zeros at the end
		for (int num : newArr) {
			System.out.print(num + " ");
		}
	}
}
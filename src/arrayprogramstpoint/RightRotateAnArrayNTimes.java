package arrayprogramstpoint;

public class RightRotateAnArrayNTimes {

	static void rightRotateAnArray(int[] arr) {
		// store last element of an array
		int temp = arr[arr.length - 1];
		// shift element one position right
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		// store last element in first position
		arr[0] = temp;
	}

	static void rightRotateNtimes(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			rightRotateAnArray(arr);
		}

	}

	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = 1;
		printArray(arr);
		rightRotateNtimes(arr, n);
		printArray(arr);

	}

}
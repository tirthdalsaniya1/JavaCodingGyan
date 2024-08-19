package arrayprogramstpoint;

public class LeftRotateAnArrayNTimes {

	static void leftRotateAnArray(int[] arr) {
		// store first element of an array
		int temp = arr[0];

		int l = arr.length;
		// shift element to left by one position
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		// now move first element to last
		arr[l - 1] = temp;
	}

	static void leftRotateNtimes(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			leftRotateAnArray(arr);

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
		System.out.println("original array");
		printArray(arr);
		int n = 1;
		leftRotateNtimes(arr, n);
		System.out.println("original array after rotate left");
		printArray(arr);

	}

}
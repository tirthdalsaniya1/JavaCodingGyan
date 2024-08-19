package arrayprogramstpoint;

public class PrintNthLargestFromArray {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 9, 2, 3, 4, 5, 6 };// 0 1 2 3 4 5 6 9

		int length = arr.length;
		int largest = 1;

		int i = printNthLargest(arr, length, largest);
		System.out.println(i);
	}

	static int printNthLargest(int[] arr, int l, int largest) {

		if (l <= 1) {
			return arr[0];
		}
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[l - largest];

	}
}
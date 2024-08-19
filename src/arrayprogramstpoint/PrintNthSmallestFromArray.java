package arrayprogramstpoint;

public class PrintNthSmallestFromArray {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 9, 2, 3, 4, 5, 6 };// 0 1 2 3 4 5 6 9

		int length = arr.length;
		int smallest = 2;

		int i = printNthSmallest(arr, length, smallest);
		System.out.println(i);
	}

	static int printNthSmallest(int[] arr, int l, int smallest) {

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
		return arr[0+smallest];

	}
}
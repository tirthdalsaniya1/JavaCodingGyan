package arrayprogramstpoint;

public class KthLargestNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 9, 8, 7, 6 };
		int k = 2;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
			if (i == k-1 ) {

				System.out.println(k + "th largest number is " + arr[i]);
			}

		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}

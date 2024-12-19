package stringprograms;

public class SortStringNumbersAndFindKthLargestAndSmallest {

	public static void main(String[] args) {
		String s = "987123456";

		char[] a = s.toCharArray();

		char temp = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (char d : a) {
			System.out.print(d);
		}
		System.out.println();

		// Find the 1st largest number (k = 1) for testing
		char kthLargest = findKthLargestNumber(a, 1);
		System.out.println("1st Largest: " + kthLargest);

		// Find the 3rd smallest number (k = 3) for testing
		char kthSmallest = findKthSmallestNumber(a, 3);
		System.out.println("3rd Smallest: " + kthSmallest);

	}

	public static char findKthSmallestNumber(char a[], int k) {
		if (k > 0 && k <= a.length) {
			return a[k - 1]; // k-th smallest element is at index k-1
		}
		return '\0'; // Return -1 if k is out of bounds
	}

	public static char findKthLargestNumber(char a[], int k) {
		if (k > 0 && k <= a.length) {
			return a[a.length - k]; // k-th largest element is at index a.length - k
		}
		return '\0'; // Return -1 if k is out of bounds
	}

}

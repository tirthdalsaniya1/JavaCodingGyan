package arrayprogramstpoint;

public class KthLargestAndSmallestNumber {
	public static void main(String[] args) {

		int[] a = { 11, 0, 2, 1, 3, 4, 5, 6, 7, 8, 9, 10 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					temp = a[i]; // temp=12
					a[i] = a[j]; // =0
					a[j] = temp; // 12

				}
			}

		}

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i]);
			if (i != a.length - 1)
				System.out.print(" ");
		}
		System.out.println();
		// Find the 1st largest number (k = 1) for testing
        int kthLargest = findKthLargestNumber(a, 1);
        System.out.println("1st Largest: " + kthLargest);

        // Find the 3rd smallest number (k = 3) for testing
        int kthSmallest = findKthSmallestNumber(a, 3);
        System.out.println("3rd Smallest: " + kthSmallest);

	}

	 public static int findKthSmallestNumber(int a[], int k) {
	        if (k > 0 && k <= a.length) {
	            return a[k - 1];  // k-th smallest element is at index k-1
	        }
	        return -1;  // Return -1 if k is out of bounds
	    }

	    public static int findKthLargestNumber(int a[], int k) {
	        if (k > 0 && k <= a.length) {
	            return a[a.length - k];  // k-th largest element is at index a.length - k
	        }
	        return -1;  // Return -1 if k is out of bounds
	    }

}

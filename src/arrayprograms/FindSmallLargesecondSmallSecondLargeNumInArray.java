package arrayprograms;

public class FindSmallLargesecondSmallSecondLargeNumInArray {

	public static void main(String[] args) {
		int[] a = { 0, 2, 1, 3, 4, 5, 6, 7, 8, 9, 10 };

		int temp = 0;
		int l = a.length;

		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}

		}
		for (int k : a) {
			System.out.println("sorted elements are "+k);
		}
		int smallest = a[0];
		int secondSmallest = a[1];
		int largest = a[l - 1];
		int secondLargest = a[l - 2];
		System.out.println("smallest number is " + smallest);
		System.out.println("second smallest number is " + secondSmallest);
		System.out.println("largest number is " + largest);
		System.out.println("secondLargest number is " + secondLargest);

	}

}

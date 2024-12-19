package arrayprograms;

public class FindSecondLargesrAndLargestNumberInArrayWithoutSortingWithDuplicates {

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 6, 5 };

		// Find Largest and Second Largest number without sorting and without removing
		// duplicates

		int largest = 0;
		int secondLargest = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			}
			if (a[i] > secondLargest && a[i] < largest) {
				secondLargest = a[i];
			}
		}
		System.out.println("largest is " + largest);
		System.out.println("second largest is " + secondLargest);

	}
}
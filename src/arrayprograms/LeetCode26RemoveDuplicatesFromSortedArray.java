package arrayprograms;

public class LeetCode26RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		
		//Remove duplicates from sorted array and return size of unique elements 
		int k = removeDuplicates(arr);
		System.out.println("size is " + k);

	}

	static int removeDuplicates(int[] a) {
		int j = 0;
		for (int i = 1; i < a.length; i++) {

			if (a[i] != a[j]) {
				j++;
				a[j] = a[i];

			}
		}

		for (int i = 0; i <= j; i++) {
			System.out.print(a[i]);
		}

		return j + 1;
	}
}
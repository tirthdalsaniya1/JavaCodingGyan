package arrayprograms;

public class LeetCode27RemoveGivenElementOccuranceFromArray {

	public static void main(String[] args) {
		int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		
		//Remove all occurance of given element from array and return size of the remaining elements 
		int[] a = { 1, 1, 1, 1, 2, 2, 3, 3, 4 };
		int removeEle = 1;

		int i = removeElementAndReturnElementK(a, removeEle);
		System.out.println("number of elements after removing given element" + i);
	}

	static int removeElementAndReturnElementK(int a[], int removeEle) {

		int j = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] != removeEle) {

				a[j] = a[i];
				j++;
			}
		}
		for (int i = 0; i < j; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		int k = j;
		return k;
	}

}
package arrayprograms;

public class FindSecondLargesrNumberIntArray {

	public static int getSecondLargest(int[] a, int length) {
		int temp;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[length-2];
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3 };
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Second Largest: " + getSecondLargest(a, a.length));
		System.out.println("Second Largest: " + getSecondLargest(b, b.length));
	}
}
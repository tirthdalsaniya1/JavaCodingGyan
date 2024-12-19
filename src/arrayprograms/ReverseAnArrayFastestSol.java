package arrayprograms;

public class ReverseAnArrayFastestSol {

	static void reverseAnArray(int[] a) {
		int length = a.length;
		for (int i = 0; i < length / 2; i++) {
			int temp = a[i];
			a[i] = a[length - 1 - i];
			a[length - 1 - i] = temp;
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		reverseAnArray(a);

		for (int x : a) {
			System.out.print(x + " ");
		}
	}

}

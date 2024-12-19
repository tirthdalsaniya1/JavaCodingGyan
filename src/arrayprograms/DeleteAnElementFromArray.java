package arrayprograms;

public class DeleteAnElementFromArray {

	static void deleteAnElement(int[] a, int position) {
		int l = a.length;

		if (position >= l || position < 0) {
			System.out.println("position is not correct");
			return;
		}
		// Shift elements to the left
		for (int i = position; i < l - 1; i++) {
			a[i] = a[i + 1];
		}
		// Set the last element to 0
		a[l - 1] = 0;

		// Print the updated array
		for (int i : a) {
			System.out.print(i);
		}

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };

		deleteAnElement(a, 3);

	}

}
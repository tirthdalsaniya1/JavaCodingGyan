package arrayprograms;

public class InsertAnElementIntoArray {

	static void insertAnElement(int[] a, int position, int element) {
		int l = a.length;

		if (position >= l || position < 0) {
			System.out.println("position is not correct");
			return;
		}
		// Shift elements to the end
		for (int i = l - 2; i >= position; i--) {

			a[i + 1] = a[i];
		}
		// Insert the new element
		a[position] = element;

		// Print the updated array
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };

		insertAnElement(a, 0, 110);

	}

}

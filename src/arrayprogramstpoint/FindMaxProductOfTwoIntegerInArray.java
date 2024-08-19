package arrayprogramstpoint;

public class FindMaxProductOfTwoIntegerInArray {

	public static void main(String[] args) {
		int[] a = { 0, 2, -3, -5, 4 };

		// first sort array in desc order

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (int i : a) {
			System.out.println(i);

		}
		int product = a[0] * a[1];
		System.out.println("product is " + product);
	}

}
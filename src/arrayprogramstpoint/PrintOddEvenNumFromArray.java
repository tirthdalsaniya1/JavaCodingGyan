package arrayprogramstpoint;

public class PrintOddEvenNumFromArray {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 9, 2, 3, 4, 5, 6 };

		for (int i : arr) {

			if (i % 2 == 0) {
				System.out.println("even number " + i);
			} else {
				System.out.println("odd number " + i);

			}
		}

	}

}

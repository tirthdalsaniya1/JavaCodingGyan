package arrayprogramstpoint;

public class PrintLargestElementOfAnArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int max = Integer.MIN_VALUE;

		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println("largest element is "+max);
	}

}

package arrayprogramstpoint;

public class PrintSmallestElemetnOfAnArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int min = Integer.MAX_VALUE;

		for (int i : arr) {
			if (i < min) {
				min = i;
			}
		}
		System.out.println("smallest element is " + min);
	}

}

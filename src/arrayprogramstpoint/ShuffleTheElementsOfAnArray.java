package arrayprogramstpoint;

import java.util.Random;

public class ShuffleTheElementsOfAnArray {

	public static void main(String[] args) {

		int[] a = { 0, 1, 2, 3 };
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			int j = random.nextInt(i + 1);
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

		for (int i : a) {
			System.out.println(i);
		}
	}

}

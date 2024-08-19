package arrayprogramstpoint;

import java.util.ArrayList;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 1 };

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = a.length - 1; i >= 0; i--) {

			list.add(a[i]);

		}
		System.out.println(list);
	}

}
package arrayprograms;

import java.util.ArrayList;

public class RemoveFirstRepeatedNumberInArray {

	public static void main(String[] args) {
		int c = 0;

		int[] a = { 1, 2, 3, 4, 5, 1, 2 };
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			int counter = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j])
					counter++;
			}
			if (counter > 1) {
				System.out.println(" First Repeated Number is : " + n);
				c = n;
				break;
			}
		}

		ArrayList<Integer> list = new ArrayList<>();

		for (int i : a) {

			if (i == c && !(list.contains(c))) {
				list.add(i);
			} else if (i != c) {
				list.add(i);
			}
		}

		// Step 3: Output the modified array
		System.out.println("Array after removing the first repeated number: " + list);
	}

}
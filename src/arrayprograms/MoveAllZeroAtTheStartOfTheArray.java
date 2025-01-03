package arrayprograms;

public class MoveAllZeroAtTheStartOfTheArray {

	public static void main(String[] args) {
		int a[] = { 30, 5, 0, 6, 3, 91, 0, 2, 50, 0 };
		// O/p = 0,0,0,30,5,6,3,91,2,50

		for (int i = a.length - 1; i >= 0; i--) {

			for (int j = i - 1; j >= 0; j--) {

				if (a[i] == 0) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

}

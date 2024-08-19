package javaconcept2;

public class Trial1111 {
	public static void main(String[] args) {
		int[] array = { 1, 0, 2, 0, 3, 0, 4, 5, 6, 7 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				for (int j = i; j > 0; j--) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}

		for (int k : array) {
			System.out.print(k + " ");
		}

	}
}

package javaconcept2;

public class TrialClass {
	public static void main(String[] args) {
		// Write a Java program to move at end
		int[] array = { 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				for (int j = i; j < array.length-1; j++) {

					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

		}

		for (int k : array) {
			System.out.print(k + " ");
		}
	}
}

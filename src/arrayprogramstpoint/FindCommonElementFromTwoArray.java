package arrayprogramstpoint;

public class FindCommonElementFromTwoArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 2, 3, 5, 6 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				// If you just want to print it then syso is enough
				/*
				 * Here break will not iterate further through j loop if it will find one common
				 * element
				 */
				// NOTE: if you want to store it then use hashset
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
					break;
				}
			}
		}

	}

}

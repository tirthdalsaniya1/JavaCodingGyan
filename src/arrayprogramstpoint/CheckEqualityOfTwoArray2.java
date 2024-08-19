package arrayprogramstpoint;

public class CheckEqualityOfTwoArray2 {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 0, 2, 3, 4, 1, 7, 6 };
		int[] arr1 = { 1, 0, 0, 2, 3, 4, 1, 7, 6 };

		boolean isEqual = true;
		if (arr.length == arr1.length) {

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != arr1[i]) {
					isEqual = false;
				}
			}

		} else {
			isEqual = false;
			System.out.println("length of both array are not equal");

		}

		if (isEqual == true) {
			System.out.println("Arrays are equal");

		} else {
			System.out.println("not equal");

		}

	}

}

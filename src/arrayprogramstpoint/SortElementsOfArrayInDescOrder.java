package arrayprogramstpoint;

public class SortElementsOfArrayInDescOrder {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 9, 2, 3, 4, 5, 6 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}

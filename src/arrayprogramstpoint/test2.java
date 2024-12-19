package arrayprogramstpoint;

public class test2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 1, 2, 1, 9, 9 };
		int count;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = 0;
				}

			}

			if (count > 1 && arr[i] != 0) {
				System.out.println("occurance of " + arr[i] + " is " + count);
			}
		}

	}

}
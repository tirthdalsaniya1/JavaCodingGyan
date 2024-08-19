package arrayprograms;

public class FindDuplicateNumberInArray {

	public static void main(String[] args) {
		int[] a = { 4, 5, 6, 7, 8, 9, 9 ,9};

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
					
				}
			}
			if (count > 1) {
				System.out.println("duplicate int element is: "+a[i]);
				break;
			}

		}

	}

}

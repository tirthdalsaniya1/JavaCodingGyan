package arrayprograms;

public class FindMaximumNumberOfConsecutiveOneInArray {

	public static void main(String[] args) {
		int[] a = { 1, 1, 0, 1, 1, 1 };

		// here first it will consider 1,1 and count will be 1
		// then after 1, 0 = no count
		// then 0,1 = no count
		// then 1,1 it will consider count 1
		// then 1,1 it will consider count 1
		// so total count will be 3
		int count = 0;
		int givenNo = 1;
		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] == givenNo) {

				if (a[i] == a[i + 1]) {
					count++;
				}
			}
		}

		System.out.println("count is " + count);
	}

}
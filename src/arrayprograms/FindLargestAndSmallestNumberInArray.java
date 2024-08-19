package arrayprograms;

public class FindLargestAndSmallestNumberInArray {

	public static void main(String[] args) {
		int[] array = { 1, 11, 21, 32, 43 };

		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;

		for (int i : array) {

			if (i > largest) {
				largest = i;
			}
			
			if (i < smallest) {
				smallest = i;
			}
		}
		System.out.println("largest is "+ largest);
		System.out.println("smallest is "+ smallest);

	}
}

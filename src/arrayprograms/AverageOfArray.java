package arrayprograms;

public class AverageOfArray {

	public static void main(String[] args) {
		// Java: Calculate the average value of array elements

		int[] array = { 3, 4, 5, 7, 9 };

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];

		}
		double avg = sum / array.length;
		System.out.println(avg);
	}

}

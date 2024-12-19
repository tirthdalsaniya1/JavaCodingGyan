package matrixprograms;

public class PrimaryAndSecondaryDiagonalSum {

	// find sum of Primary and Secondary Diagonal =
	// Secondary 3 + 5 + 7 = 15
	// Primary 1+5+9 = 15
	// total = 30
	/*
	 * 123 456 789
	 * 
	 */
	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int primarySum = 0;
		int secondarySum = 0;

		for (int i = 0; i < a.length; i++) {
			primarySum = primarySum + a[i][i];
			secondarySum = secondarySum + a[i][a.length - i - 1];
		}
		System.out.println(primarySum + secondarySum);

	}

}

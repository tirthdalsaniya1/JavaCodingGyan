package matrixprograms;

public class SecondaryDiagonalSum {

	// find sum of Secondary Diagonal = 3 + 5 + 7 = 15
	/*
	 * 123 456 789
	 * 
	 */
	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int sum = 0;

		for (int i = a.length-1; i >=0; i--) {
			System.out.println(i);
			sum = sum + a[i][i];

		}
		System.out.println(sum);

	}

}

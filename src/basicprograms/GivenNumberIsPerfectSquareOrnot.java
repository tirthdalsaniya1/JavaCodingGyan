package basicprograms;

import java.util.Scanner;

public class GivenNumberIsPerfectSquareOrnot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		boolean isPerfectSquare = false;
		int givenNumber = sc.nextInt();

		for (int i = 1; i * i <= givenNumber; i++) {

			int m = i * i;
			if (m == givenNumber) {
				isPerfectSquare = true;
				break;
			}
		}

		if (isPerfectSquare) {
			System.out.println("this is perfect square");

		} else {
			System.out.println("not perfect square");

		}

	}

}

package basicprograms;

public class GivenNumberIsPrimeOrNot {

	public static void main(String[] args) {

		int num = 0;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {

				count++;

			}

		}

		if (count == 2) {
			System.out.println("count is "+count+ " its prime");

		} else {
			System.out.println("count is "+count+ " not prime");
		}

	}

}

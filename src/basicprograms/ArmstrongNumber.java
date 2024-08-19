package basicprograms;

/*
 * Armstrong num is a number that is equal to the sum of cube of its digit
 * Example : 153 = 1^3+ 5^3 + 3^3= 1+125+27= 153 = Armstrong number
 */
public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int temp = num;
		int sum = 0;
		while (num > 0) {

			sum = sum + (num % 10) * (num % 10) * (num % 10);
			num = num / 10;
		}
		System.out.println(sum);

		if (temp == sum) {
			System.out.println("its armstrong");
		} else {
			System.out.println("not armstrong");

		}
	}
}

//0 + 27= 27
//27+ 5*5*5 = 125+27+1
package arrayprograms;

public class SumOfAnArray {

	public static void main(String[] args) {

		int array[] = { 0,1, 2, 3, 4 };
		int sum = 0;

		for (int i : array) 
			sum = sum + i;
		System.out.println("The sum is " + sum);

	}
}

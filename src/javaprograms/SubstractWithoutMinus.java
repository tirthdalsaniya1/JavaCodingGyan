package javaprograms;

public class SubstractWithoutMinus {
	static int substract(int x, int y) {

		if (x > y) {
			for (int i = 1; i <= y; i++)
				x--;
			return x;

		} else {
			for (int i = 1; i <= x; i++)
				y--;
			return y;

		}

	}

	public static void main(String[] args) {
		// first number is 10 and second number is 32 , for
		// loop will start from 1 and move till 32 and the
		// value of a is incremented 32 times which will
		// give us the total sum of two numbers
		int a = substract(100, 110);
		System.out.print(a);
	}

}

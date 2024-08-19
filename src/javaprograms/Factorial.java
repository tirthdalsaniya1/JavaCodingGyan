package javaprograms;
import java.util.Scanner;

public class Factorial {

	static int factorial(int number) {
		int fact = 1;
		int i=1;
		while (i<=number) {
			fact = fact * i;
			i++;
		}
		return fact;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		System.out.println(factorial(i));
	}

}


//4*3* 

//5*2*
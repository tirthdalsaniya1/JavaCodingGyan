package javaprograms;
import java.util.Scanner;

public class FactorialRecursion {

	static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		else {
			n= n*factorial(n-1) ;
		}
		return n ;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(factorial(i));
	}

}

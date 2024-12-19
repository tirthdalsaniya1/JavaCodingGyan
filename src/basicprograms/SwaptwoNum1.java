package basicprograms;

public class SwaptwoNum1 {

	public static void main(String[] args) {

		int i1 = 10;
		int i2 = 20;
		int temp;

		temp = i1;
		i1 = i2;
		i2 = temp;

		System.out.println(i1 + " " + i2 + " " + temp);
	}

}

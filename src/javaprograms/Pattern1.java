package javaprograms;

public class Pattern1 {

	public static void main(String[] args) {

		String s= "india";
		int l = s.length();
		for (int z= 0; z <= 4 ; z++) {

			for (int i = 0; i <= z; i++) {

				System.out.print( s.charAt( i ) );
			}
			System.out.println( );
		}

	}
}

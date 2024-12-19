package numberproblems;

public class CountOnes {

	public static void main(String[] args) {
		/*
		 * suppose I give you any number which is positive then you have to count number
		 * 1 which comes till that number including that number.
		 * 
		 * For example int n= 11;
		 * 
		 * so here if we start from 1 then 1, 10, 11 contains 1 so total occurrence of 1
		 * is 4
		 * 
		 */
		
		int n = 11; // Example input
        int count = 0;

        for (int i = 1; i <= n; i++) {
            // Convert the number to a string
            String number = String.valueOf(i);
            // Count occurrences of '1' in the string
            for (char c : number.toCharArray()) {
                if (c == '1') {
                    count++;
                }
            }
        }

        System.out.println("Total occurrences of 1 from 1 to " + n + ": " + count);

	}

}

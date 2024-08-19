package stringprograms;

public class ReverseStringBasic6 {

	    public static void main(String[] args) {
	        // Input number
	        long input = 32400121200L;
	        
	        // Convert input number to string
	        String inputStr = Long.toString(input);
	        
	        // Count number of zeros
	        int zeroCount = 0;
	        for (char c : inputStr.toCharArray()) {
	            if (c == '0') {
	                zeroCount++;
	            } else {
	                break; // Exit loop when non-zero digit is encountered
	            }
	        }
	        
	        // Construct output string
	        StringBuilder output = new StringBuilder();
	        for (int i = 0; i < zeroCount; i++) {
	            output.append('0');
	        }
	        output.append(inputStr.substring(zeroCount));
	        
	        // Print output
	        System.out.println("Output: " + output.toString());
	    }
	}



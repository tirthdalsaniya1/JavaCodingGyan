package stringprograms;

public class ReverseStringBasic4 {

	    public static String reverseParticularCharacters(String str, int startIndex, int endIndex) {
	        if (str == null || startIndex < 0 || endIndex >= str.length()) {
	            return str; // return original string if string is null or indices are out of bounds
	        }

	        StringBuilder reversed = new StringBuilder(str);
	        while (startIndex < endIndex) {
	            char temp = reversed.charAt(startIndex);
	            reversed.setCharAt(startIndex, reversed.charAt(endIndex));
	            reversed.setCharAt(endIndex, temp);
	            startIndex++;
	            endIndex--;
	        }

	        return reversed.toString();
	    }

	    public static void main(String[] args) {
	        String input = "Yogesh is back now";
	        int startIndex = 6;
	        int endIndex = 9;
	        String output = reverseParticularCharacters(input, startIndex, endIndex);
	        System.out.println("Reversed String: " + output);
	    }
	}

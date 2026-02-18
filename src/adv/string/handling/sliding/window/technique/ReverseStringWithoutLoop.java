package adv.string.handling.sliding.window.technique;

public class ReverseStringWithoutLoop {

	public static void main(String[] args) {
		String originalString = "Hello World";
		reverseUsingStringBuilder(originalString);
		reverseUsingStringBuffer(originalString);
		
        String reversedString = reverseUsingRecursion("Recursion");
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
	}

	public static void reverseUsingStringBuilder(String originalString) {
		StringBuilder sb = new StringBuilder(originalString);
		sb.reverse();
		System.out.println(sb.toString());
	}
	
	public static void reverseUsingStringBuffer(String originalString) {
		StringBuffer sf = new StringBuffer(originalString);
		sf.reverse();
		System.out.println(sf.toString());
	}
	
	public static String reverseUsingRecursion(String str) {
		if (str.length() <= 1) {
            return str; // Base case: an empty or single-character string is its own reverse
        } else {
            // Recursive step: take the last character and concatenate it with the reversed
            // version of the rest of the string
            return str.substring(str.length() - 1) + reverseUsingRecursion(str.substring(0, str.length() - 1));
        }
    }
}

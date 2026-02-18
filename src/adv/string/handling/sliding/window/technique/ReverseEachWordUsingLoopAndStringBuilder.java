package adv.string.handling.sliding.window.technique;

public class ReverseEachWordUsingLoopAndStringBuilder {

	public static void main(String[] args) {
		// Original String: Hello World! Java is great.
		// Reversed Words: olleH !dlroW avaJ si .taerg
		String input = "Hello World! Java is great.";
		reverseEachWordUsingLoopAndStringBuilder(input);
	}
	
	public static void reverseEachWordUsingLoopAndStringBuilder(String input) {
		String[] words = input.split(" ");
		StringBuilder reverseSentence = new StringBuilder();
		for(String word:words) {
			StringBuilder reverseWord = new StringBuilder(word);
			reverseWord.reverse();
			
			reverseSentence.append(reverseWord).append(" ");
		}
		System.out.println(reverseSentence.toString());
	}
}

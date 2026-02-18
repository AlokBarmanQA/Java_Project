package adv.string.handling.sliding.window.technique;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordUsingJava8 {

	public static void main(String[] args) {
		// Original String: Hello World! Java is great.
		// Reversed Words: olleH !dlroW avaJ si .taerg
		String input = "Hello World! Java is great.";
		reverseEachWordUsingLoopAndStringBuilder(input);
		reverseEachWordUsingLoopAndStringBuilder(input);
	}
	
	public static void reverseEachWordUsingLoopAndStringBuilder(String input) {
		String reverseSentence = Arrays.stream(input.split(" "))
				.map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println(reverseSentence);
	}
}

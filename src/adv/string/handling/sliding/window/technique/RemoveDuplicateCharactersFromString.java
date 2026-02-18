package adv.string.handling.sliding.window.technique;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharactersFromString {

	public static void main(String[] args) {
		String input = "programming";
		
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for(Character ch:input.toCharArray()) {
			lhs.add(ch);
		}
		StringBuilder sb = new StringBuilder();
		for(Character c: lhs) {
			sb.append(c);
		}
		System.out.println(sb.toString());
	}

}

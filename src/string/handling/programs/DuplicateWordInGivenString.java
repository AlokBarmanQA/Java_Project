package string.handling.programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordInGivenString {

	public static void main(String[] args) {
		String str = "java selenium language java cucumber with java";
		String[] words = str.split(" ");
		Set<String> set = new HashSet<>();
		for(String word:words) {
			if(!set.add(word)) {
				System.out.println(word + " is duplicate word");
			}
		}
	}

}

package adv.string.handling.sliding.window.technique;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindAllUniqueCharactersInString {

	public static void main(String[] args) {
		String testString = "hello world";
		findAllUniqueCharsUsingSet(testString);
        
        String testString2 = "programming";
        findAllUniqueCharsUsingSet(testString2);
        
        findAllUniqueCharsUsingMap(testString);
        System.out.println("\n");
        findAllUniqueCharsUsingMap(testString2);
	}

	private static void findAllUniqueCharsUsingSet(String str) {
		Set<Character> set = new HashSet<>();
		for(Character ch: str.toCharArray()) {
			set.add(ch);
		}
		System.out.println(set);
	}
	
	private static void findAllUniqueCharsUsingMap(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for(Character ch: str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
		for(char ch : map.keySet()) {
			if(map.get(ch) == 1) {
				System.out.print(ch+" ");
			}
		}
	}
}

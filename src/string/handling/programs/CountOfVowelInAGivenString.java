package string.handling.programs;

import java.util.HashMap;
import java.util.Map;

public class CountOfVowelInAGivenString {

	public static void main(String[] args) {
		String str = "asdertiuyohjubnn";
		char[] ch = str.toCharArray();
		Map<Character, Integer> hm = new HashMap<>();
		for(char c: ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		for(char cha: hm.keySet()) {
			if(cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u') {
				System.out.println(cha +" - "+hm.get(cha));
			}
		}
	}

}

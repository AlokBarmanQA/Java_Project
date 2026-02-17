package arrays.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingElement {

	public static void main(String[] args) {
		String str="abcdeacbvmkl";
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(Character c:ch) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				char repeatChar = entry.getKey();
				System.out.println(repeatChar);
			}
		}
	}

}

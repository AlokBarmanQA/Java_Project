package adv.string.handling.sliding.window.technique;

import java.util.LinkedHashMap;

public class FIndTheFirstNonRepeatedCharacterInAString {

	public static void main(String[] args) {
		String input1 = "teeter";
        Character firstNonRepeated1 = findFirstNonRepeatedChar(input1);
        System.out.println("The first non-repeated character in \"" + input1 + "\" is: " + firstNonRepeated1); // Output: 'r'

        String input2 = "aabbcc";
        Character firstNonRepeated2 = findFirstNonRepeatedChar(input2);
        System.out.println("The first non-repeated character in \"" + input2 + "\" is: " + firstNonRepeated2); // Output: null

        String input3 = "java concept of the day";
        Character firstNonRepeated3 = findFirstNonRepeatedChar(input3);
        System.out.println("The first non-repeated character in \"" + input3 + "\" is: " + firstNonRepeated3); // Output: 'j'
    

	}

	private static Character findFirstNonRepeatedChar(String input) {
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		for(Character ch : input.toCharArray()) {
			lhm.put(ch, lhm.getOrDefault(ch, 0)+1);
		}
		//System.out.println(lhm);
		for(Character c : lhm.keySet()) {
			if(lhm.get(c) == 1) {
				//System.out.println("First Non-repeated Character: "+c);
				return c;
			}
				
		}
		return null;
	}

}

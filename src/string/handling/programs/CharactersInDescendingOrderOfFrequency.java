package string.handling.programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharactersInDescendingOrderOfFrequency {

	public static void main(String[] args) {
		String str = "charactersindescendingorderoffrequency";
		char[] ch = str.toCharArray();
		Map<Character, Integer> hm = new HashMap<>();
		for(int i=0; i<ch.length; i++) {
			if(hm.containsKey(ch[i])) {
				hm.put(ch[i], hm.get(ch[i])+1);
			}
			else {
				hm.put(ch[i], 1);
			}
		}
		System.out.println(hm);
		
		// Step 2: Convert the map entries to a List for sorting
		List<Map.Entry<Character, Integer>> list = new ArrayList<>(hm.entrySet());
		System.out.println(list);
		
		// Step 3: Sort the list by frequency in descending order
        // The comparator sorts by value (frequency) in reverse order
		list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
		System.out.println(list);
		
		// Step 4: Build the resulting string based on the sorted order
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            char character = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                sb.append(character);
            }
        }

        sb.toString();
        System.out.println(sb);
	}

}

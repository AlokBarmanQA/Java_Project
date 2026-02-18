package searching.algorithms;

import java.util.HashMap;
import java.util.Map;

public class FindOccurrenceOfElementInSortedArray {

	public static void main(String[] args) {
		countOccuranceFromIntegerArray();
		countOccuranceFromCharacterArray();
		countOccuranceFromStringArray();
	}
	
	public static void countOccuranceFromIntegerArray() {
		int[] sortedArray = {1, 1, 2, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7};
		Map<Integer, Integer> map = new HashMap<>();
		for(Integer num:sortedArray) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}
			else {
				map.put(num, 1);
			}
		}
		System.out.println(map);
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			System.out.println("Element " + key + " occurs " + value + " times.");
		}
	}
	
	public static void countOccuranceFromCharacterArray() {
		char[] sortedArray = {'a', 'a', 'b', 'b', 'c', 'c', 'c', 'd', 'e', 'f', 'c', 'e', 'd'};
		Map<Character, Integer> map = new HashMap<>();
		for(Character ch:sortedArray) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			char key = entry.getKey();
			int value = entry.getValue();
			System.out.println("Element " + key + " occurs " + value + " times.");
		}
	}
	
	public static void countOccuranceFromStringArray() {
		String[] sortedArray = {"java", "java", "C#", "C#", "Python", "Perl", "java"};
		Map<String, Integer> map = new HashMap<>();
		for(String word:sortedArray) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}
			else {
				map.put(word, 1);
			}
		}
		System.out.println(map);
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("Element " + key + " occurs " + value + " times.");
		}
	}

}

package interview;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElementsInArray {

	public static void main(String[] args) {
		/*
		 * int numberArray[] = {1, 1, 2, 3, 3, 4, 4, 5};
		 * Integer numberArray1[] =  {1, 1, 2, 3, 3, 4, 4, 5};
		 * The primary difference is that int numberArray[] is an array of primitive
		 * data types, while Integer numberArray1[] is an array of object references
		 * (the wrapper class for int).
		 */
		/*
		 * Primitive Array (int[]): Each element stores the actual numeric value
		 * directly in memory. This is highly efficient, as each element typically
		 * occupies exactly bits (bytes). Wrapper Array (Integer[]): Each element stores
		 * a reference (a memory address) to an Integer object stored on the heap. This
		 * consumes more memory because it requires space for both the reference and the
		 * object metadata.
		 */

		//int numberArray[] = {1, 1, 2, 3, 3, 4, 4, 5, 3};
		Integer numberArray[] =  {1, 1, 2, 3, 3, 4, 4, 5, 3};
		
		countFrequencyOfElementsInArray(numberArray);
		System.out.println("================================================");
		countFrequencyOfElementsInArrayMethod2(numberArray);
	}
	
	public static void countFrequencyOfElementsInArray(Integer[] numberArray) {
		Map<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<numberArray.length; i++) {
			System.out.println(hm.containsKey(numberArray[i]));
			if(hm.containsKey(numberArray[i])) {
				System.out.println(numberArray[i]);
				hm.put(numberArray[i], hm.get(numberArray[i])+1); 
			}
			else {
				System.out.println(numberArray[i]);
				hm.put(numberArray[i], 1);
			}
		}
		System.out.println(hm);
	}
	
	public static void countFrequencyOfElementsInArrayMethod2(Integer[] numberArray) {
		Map<Integer, Integer> hm = new HashMap<>();
		for(Integer ele:numberArray) {
			hm.merge(ele, 1, Integer::sum);
		}
		System.out.println(hm);
	}
}

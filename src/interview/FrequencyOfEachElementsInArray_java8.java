package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElementsInArray_java8 {

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

		int numberArray[] = {1, 1, 2, 3, 3, 4, 4, 5, 3};
		//Integer numberArray[] =  {1, 1, 2, 3, 3, 4, 4, 5, 3};
		
		System.out.println(getFrequincies(numberArray));
	}
	
	public static Object[] getFrequincies(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return map.entrySet().toArray();
		
//		Map<Integer, Long> freq = Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//	    return freq.entrySet().toArray();
	}
}

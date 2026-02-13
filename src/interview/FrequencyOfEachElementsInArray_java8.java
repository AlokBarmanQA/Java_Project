package interview;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElementsInArray_java8 {

	public static void main(String[] args) {
		int numberArray[] = {1, 1, 2, 3, 3, 4, 4, 5, 3};
		Integer objectArray[] =  {1, 1, 2, 3, 3, 4, 4, 5, 3};
		
		getIntegerFrequincies(numberArray);
		getObjectFrequencies(objectArray);
	}
	
	public static Map<Integer, Long> getIntegerFrequincies(int[] numberArray) {
		//Step 1: Convert Array to Stream
		/* Arrays.stream(numberArray).boxed(); */
		//Step 2: Group and Count
		/*
		 * Use the collect method with Collectors.groupingBy. This function takes a
		 * classifier (the element itself, represented by Function.identity()) and a
		 * downstream collector (Collectors.counting()) to calculate the occurrences.
		 */
		Map<Integer, Long> arrayFrequency = Arrays.stream(numberArray).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(arrayFrequency);
		return arrayFrequency;
	}
	
	public static Map<Integer, Long> getObjectFrequencies(Integer[] objectArray) {
		Map<Integer, Long> arrayFrequencies = Arrays.stream(objectArray).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(arrayFrequencies);
		return arrayFrequencies;
	}
}

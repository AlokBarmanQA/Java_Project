package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementInArray_java8 {

	public static void main(String[] args) {
		// Sample array of Integers
        Integer[] numbers = {1, 2, 1, 3, 4, 4, 5, 2};
        
        List<Integer> list = Arrays.asList(1, 2, 1, 3, 4, 4, 5, 2);
        
		System.out.println("==================================");
		findDuplicateUsingSet(arr);
		System.out.println("***********************************");
	//	findDuplicateUsingNestedLoops(arr);
	}
	
	public static void findDuplicateFromArray(int[] arr) {
		  // A set to store unique elements encountered so far
        Set<Integer> uniqueElements = new HashSet<>();
        
        // Use Java 8 streams to filter out duplicates
        Set<Integer> duplicates = Arrays.stream(numbers)
            // Filter elements where Set.add() returns false (meaning it was already present)
            .filter(n -> !uniqueElements.add(n))
            // Collect the filtered elements into a Set to ensure only unique duplicates are stored
            .collect(Collectors.toSet());
            
        // Print the duplicate elements
        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Duplicate elements: " + duplicates); // Output: Duplicate elements: [1, 2, 4]
    }
	
	public static void findDuplicateFromList(int[] arr) {
		 Set<Integer> duplicates = list.stream()
		            // Filter elements that appear more than once
		            .filter(i -> Collections.frequency(list, i) > 1)
		            // Collect into a Set
		            .collect(Collectors.toSet());

		        System.out.println("Original list: " + list);
		        System.out.println("Duplicate elements (Frequency method): " + duplicates); // Output: Duplicate elements (Frequency method): [1, 2, 4]
		    
	}
	
	
}

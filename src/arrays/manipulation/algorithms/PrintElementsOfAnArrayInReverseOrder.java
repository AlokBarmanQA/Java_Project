package arrays.manipulation.algorithms;

import java.util.Arrays;
import java.util.Collections;

public class PrintElementsOfAnArrayInReverseOrder {

	public static void main(String[] args) {
		int[] originalArray = {1, 2, 3, 4, 5};
		reverseArrayPrint(originalArray);
		reverseArrayInPlace(originalArray);
		reverseArrayWithCollections();
	}
	
	public static void reverseArrayPrint(int[] originalArray) {
		System.out.println("Arrays in original order:");
		for(int i=0; i<originalArray.length; i++) {
			System.out.print(originalArray[i]+", ");
		}
		System.out.println("\nArrays in reverse order:");
		for(int i=originalArray.length-1; i>=0; i--) {
			System.out.print(originalArray[i]+", ");
		}
	}
	
	public static void reverseArrayInPlace(int[] originalArray) {
		for(int i=0; i<originalArray.length; i++) {
			int leftIndex = 0;
			int rightIndex = originalArray.length-1;
			
			while(leftIndex<rightIndex) {
				int temp = originalArray[leftIndex];
				originalArray[leftIndex]=originalArray[rightIndex];
				originalArray[rightIndex]=temp;
				
				leftIndex++;
				rightIndex--;
			}
			System.out.print(originalArray[i]+", ");
		}
		
	}
	
	public static void reverseArrayWithCollections() {
        Integer[] arr = {10, 20, 30, 40, 50}; // Must use Integer[] (wrapper class), not int[]
        System.out.println("\nOriginal array: " + Arrays.toString(arr));
        // Convert to List and reverse in-place
        Collections.reverse(Arrays.asList(arr));

        System.out.println("Reversed array: " + Arrays.toString(arr));
	}

}

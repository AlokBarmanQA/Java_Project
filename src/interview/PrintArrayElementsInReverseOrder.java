package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintArrayElementsInReverseOrder {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		//reverseUsingLoop(arr);
		reverseUsingCollections(arr);
	}
	
	public static void reverseUsingLoop(int[] arr) {
		System.out.println("Original array elements:");
		for(Integer number:arr) {
			System.out.print(number + " ");
		}
		System.out.println("\nArray elements in reverse order:");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void reverseUsingCollections(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for(Integer number:arr) {
			list.add(number);
		}
		System.out.println("Original list:"+list);
		Collections.reverse(list);
		System.out.println("List after reverse:"+list);
		System.out.println("List after loop:");
		for(Integer number:list) {
			System.out.print(number+ " ");
		}
	}
}

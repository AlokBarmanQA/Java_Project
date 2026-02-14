package interview;

import java.util.Arrays;

public class PrintSmallestNumberInArray {

	public static void main(String[] args) {
		int[] arr = {10, 90, 20, 100, 80, 30, 70, 40, 60, 50};
		smallestNumberInArrayIterativeApproach(arr);
		findSmallestWithSort(arr);
	}
	
	public static void smallestNumberInArrayIterativeApproach(int[] arr) {
		int smallest = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest number: "+smallest);
	}
	
	public static void findSmallestWithSort(int[] arr) {
		System.out.println("Before sort: "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sort: "+Arrays.toString(arr));
		int smallest = arr[0];
		System.out.println(smallest);
	}
}

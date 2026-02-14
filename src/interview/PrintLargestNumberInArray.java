package interview;

import java.util.Arrays;

public class PrintLargestNumberInArray {

	public static void main(String[] args) {
		int[] arr = {10, 90, 20, 100, 80, 30, 70, 40, 60, 50};
		largestNumberInArrayIterativeApproach(arr);
		findLargestWithSort(arr);
	}
	
	public static void largestNumberInArrayIterativeApproach(int[] arr) {
		int largest = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("Largest number: "+largest);
	}
	
	public static void findLargestWithSort(int[] arr) {
		System.out.println("Before sort: "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sort: "+Arrays.toString(arr));
		int largestNumber = arr[(arr.length-1)];
		System.out.println(largestNumber);
	}
}

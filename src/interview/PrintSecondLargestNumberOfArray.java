package interview;

import java.util.Arrays;

public class PrintSecondLargestNumberOfArray {

	public static void main(String[] args) {
		int[] arr = {10, 90, 20, 100, 30, 80, 40, 70, 60, 50};
		findSecondLargestNumber(arr);
	}
	
	public static void findSecondLargestNumber(int[] arr) {
		Arrays.sort(arr);
		int secondLargestNumber = arr[arr.length-2];
		System.out.println(secondLargestNumber);
	}
}

package interview;

import java.util.Arrays;

public class PrintSecondSmallestNumberOfArray {

	public static void main(String[] args) {
		int[] arr = {10, 90, 20, 100, 30, 80, 40, 70, 60, 50};
		findSecondLowestNumber(arr);
	}
	
	public static void findSecondLowestNumber(int[] arr) {
		Arrays.sort(arr);
		int secondLowestNumber = arr[1];
		System.out.println(secondLowestNumber);
	}
}

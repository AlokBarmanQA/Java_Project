package arrays.collections;

import java.util.Arrays;

public class KthSmallestElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1, 5, 7, 6, 4, 3, 2};
		int k = 3;
		
		if (arr == null || k < 1 || k > arr.length) {
            throw new IllegalArgumentException("Invalid input");
        }
		
		Arrays.sort(arr);
		int result = arr[k-1];
		
		System.out.println("The " + k + "rd smallest element is: " + result);
	}

}

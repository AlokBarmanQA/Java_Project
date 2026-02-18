package arrays.manipulation.algorithms;

import java.util.Arrays;

public class MoveZerosToRightSideOfAnArray {

	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 3, 12};	
        // Output: [0, 1, 0, 3, 12]
        // Output: [1, 3, 12, 0, 0]
		moveZeroes(arr);
		System.out.println(Arrays.toString(arr));
		
        int[] arr2 = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        moveZeroes(arr2);
        System.out.println(Arrays.toString(arr2));
	}

	public static void moveZeroes(int[] nums) {
		int i=0;
		for(int j=0; j<nums.length; j++) {
			if(nums[j] != 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
			}
		}
	}
}

package arrays.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNumbersInAnArray {

	public static void main(String[] args) {
		int[] arr = {2, 3, 40, 4, 5, 50, 2, 3, 60, 2, 2};
		findDuplicateUsingMultiForLoop(arr);
		
	}
	public static void findDuplicateUsingMultiForLoop(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			for(int j=(i+1); j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
					list.add(arr[j]);
				}
			}
		}
		System.out.println(list);
	}

}

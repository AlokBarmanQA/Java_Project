package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		//int[] arr = { 1, 4, 1, 2, 3, 4, 5, 4 };
		int[] arr = { 1, 4, 1, 8, 17, 8, 23, 4, 8};
	//	findDuplicateUsingArray(arr);
		System.out.println("==================================");
		findDuplicateUsingSet(arr);
		System.out.println("***********************************");
	//	findDuplicateUsingNestedLoops(arr);
	}
	
	public static void findDuplicateUsingArray(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println("Duplicate: " + arr[i]);
			}
		}
	}
	
	public static void findDuplicateUsingSet(int[] arr) {
		Set<Integer> set = new HashSet<>();
		//{ 1, 4, 1, 8, 17, 8, 23, 4, 8};
		for(Integer number:arr) {
			System.out.println(number);
			System.out.println(set);
			if(!set.add(number)) {
				System.out.println("Duplicate: "+number);
			}
		}
	}
	
	public static void findDuplicateUsingNestedLoops(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=(i+1); j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate: "+arr[j]);
				}
			}
		}
	}
	
}

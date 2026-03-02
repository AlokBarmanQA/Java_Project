package arrays.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 6, 7, 3, 5,};
		//int arr2[] = {5, 6, 6, 7, 9, 1, 2, 3, 10, 12, 12, 13, 13};
		
		findMissingNumberUsingSetAndArray(arr, 1, 7);
		//findMissingNumberUsingSetAndArray(arr2, 1, 13);
	}
	
	public static void findMissingNumberUsingSetAndArray(int[] arr, int minimumrange, int maximumrange) {
		Set<Integer> set = new HashSet<>();
		//System.out.println(Arrays.toString(arr));
		for(Integer number:arr) {
			set.add(number);
		}
		//System.out.println(set);
		List<Integer> list = new ArrayList<>();
		for(int i=minimumrange; i<=maximumrange; i++) {
			if(!set.contains(i)) {
				System.out.println(i + " is missing in the array");
				list.add(i);
			}
		}
		System.out.println("Missing numbers: " +list);
	}
}

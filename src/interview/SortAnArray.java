package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAnArray {

	public static void main(String[] args) {
		int[] arr = {2, 1, 9, 0, 6};
		//sortInAscendingOrder(arr);
		sortInDescendingOrder(arr);
	}

	public static void sortInAscendingOrder(int[] arr) {
		System.out.println("Before sorting: "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sorting Ascending/ default: "+Arrays.toString(arr));
	}
	
	public static void sortInDescendingOrder(int[] arr) {
		System.out.println("Before sorting array: "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sorting Ascending/ default array: "+Arrays.toString(arr));
		List<Integer> list = new ArrayList<>();
		for(Integer i:arr) {
			list.add(i);
		}
		System.out.println("Before reverse the List: "+list);
		Collections.reverse(list);
		System.out.println("After reverse the List: "+list);
	}
}

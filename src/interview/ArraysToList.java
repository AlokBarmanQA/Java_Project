package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysToList {

	public static void main(String[] args) {
		int[] arr = {2, 1, 8, 5, 9, 2};
		Integer[] arr1 = {2, 1, 8, 5, 9, 2};
		List<Integer> list = Arrays.asList(2, 1, 8, 5, 9, 2);
		List<Integer> arrList = new ArrayList<Integer>();
		for(int i:arr) {
			arrList.add(i);
		}
		List<Integer> arr1List = new ArrayList<Integer>(Arrays.asList(arr1));
		List<Integer> arrList_java8 = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> arr1List_java8 = Arrays.stream(arr1).collect(Collectors.toList());
		//=================================
		// For both primitive and Object arrays
		System.out.println(Arrays.toString(arr)); 
		System.out.println(Arrays.toString(arr1));
		//=================================
		System.out.println("1->"+arr);
		System.out.println("2->"+arr1);
		System.out.println("3->"+Arrays.toString(arr));
		System.out.println("4->"+Arrays.toString(arr1));
		System.out.println("5->"+list);
		System.out.println("6->"+arrList);
		System.out.println("7->"+arr1List);
		System.out.println("8->"+arrList_java8);
		System.out.println("9->"+arr1List_java8);
	}

}

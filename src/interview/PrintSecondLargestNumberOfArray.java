package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintSecondLargestNumberOfArray {

	public static void main(String[] args) {
		int[] arr = { 10, 90, 20, 100, 30, 80, 40, 70, 60, 50 };
		findSecondLargestNumber(arr);
		int[] arr2 = { 10, 10, 90, 20, 100, 80, 30, 70, 40, 60, 50, 100 };
		findSecondLargestNumber2(arr2);
	}

	public static void findSecondLargestNumber(int[] arr) {
		Arrays.sort(arr);
		int secondLargestNumber = arr[arr.length - 2];
		System.out.println(secondLargestNumber);
	}

	public static void findSecondLargestNumber2(int[] arr2) {
		Set<Integer> ts = new TreeSet<>();
		for (Integer ar2 : arr2) {
			ts.add(ar2);
		}
		List<Integer> list = new ArrayList<>(ts);
		// ArrayList:
		Integer secondLast = list.get(list.size() - 2);
		System.out.println(secondLast);
		// Array:
		Integer[] arr = ts.toArray(new Integer[0]);
		Integer secondLastArr = arr[arr.length - 2];
		System.out.println(secondLastArr);
	}

}

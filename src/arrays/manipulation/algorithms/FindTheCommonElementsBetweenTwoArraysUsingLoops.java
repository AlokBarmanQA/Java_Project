package arrays.manipulation.algorithms;

import java.util.ArrayList;
import java.util.List;

public class FindTheCommonElementsBetweenTwoArraysUsingLoops {

	public static void main(String[] args) {
		int[] array1 = {1, 4, 5, 2, 8, 4};
        int[] array2 = {6, 1, 8, 34, 5, 1, 2};
        findCommonElements(array1, array2);
	}

	public static List<Integer> findCommonElements(int[] array1, int[] array2) {
		List<Integer> list = new ArrayList<>();
		for(Integer num1:array1) {
			for(Integer num2:array2) {
				if(num1==num2) {
					list.add(num2);
					break;
				}
			}
		}
		System.out.println(list);
		return list;
	}
}

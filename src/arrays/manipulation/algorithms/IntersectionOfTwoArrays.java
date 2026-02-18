package arrays.manipulation.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
        findIntersection();
	}

	public static void findIntersection() {
		
		int[] array1 = {23, 36, 96, 78, 55, 36};
        int[] array2 = {78, 45, 19, 73, 55, 96};
        
		List<Integer> list1 = Arrays.stream(array1).boxed().collect(Collectors.toList());
		List<Integer> list2 = Arrays.stream(array2).boxed().collect(Collectors.toList());
		
		Set<Integer> set1 = new HashSet<>(list1);
		Set<Integer> set2 = new HashSet<>(list2);
		System.out.println(set1);
		System.out.println(set2);
		
		boolean intersection = set1.retainAll(set2);
		System.out.println(intersection);
		
		Integer[] arr = set1.toArray(new Integer[0]);
		
		System.out.println(Arrays.toString(arr));
	}
}

package arrays.manipulation.algorithms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = {9, 1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        
        int[] mergedArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
        										.sorted()
        										.toArray();
        
        System.out.println(Arrays.toString(mergedArray));
	}

}

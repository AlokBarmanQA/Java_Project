package arrays.manipulation.algorithms;

import java.util.Arrays;

public class CheckIfTwoArraysAreEqual {

	public static void main(String[] args) {
		int[] array1 = {23, 36, 96, 78, 55, 73};
        int[] array2 = {78, 96, 23, 73, 55, 36};
        int[] array3 = {78, 96, 23, 73, 55, 37};
        boolean flag = ManualArrayEqualityCheck(array1, array2);
        System.out.println(flag);
        boolean flag2 = ManualArrayEqualityCheck(array2, array3);
        System.out.println(flag2);
	}

	public static boolean ManualArrayEqualityCheck(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		if(a.length != b.length) {
			return false;
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
}

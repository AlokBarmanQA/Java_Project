package arrays.manipulation.algorithms;

import java.util.Arrays;

public class CheckTheQualityOfTwoArrays {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 4, 5};
        int[] array4 = {5, 4, 3, 2, 1}; // Same elements, different order

        // Compare array1 and array2
        boolean areEqual1and2 = Arrays.equals(array1, array2);
        System.out.println("Array1 and Array2 are equal: " + areEqual1and2); // Output: true

        // Compare array1 and array3 (different length)
        boolean areEqual1and3 = Arrays.equals(array1, array3);
        System.out.println("Array1 and Array3 are equal: " + areEqual1and3); // Output: false

        // Compare array1 and array4 (different order)
        boolean areEqual1and4 = Arrays.equals(array1, array4);
        System.out.println("Array1 and Array4 are equal: " + areEqual1and4); // Output: false
        
        boolean areEqual1and4UsingEquals = array1.equals(array4);
        System.out.println("Array1 and Array4 are equal: " + areEqual1and4UsingEquals); // Output: false
	}

}

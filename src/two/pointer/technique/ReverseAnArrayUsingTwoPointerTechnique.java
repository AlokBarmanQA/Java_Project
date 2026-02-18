package two.pointer.technique;

import java.util.Arrays;

public class ReverseAnArrayUsingTwoPointerTechnique {

	public static void main(String[] args) {
		int[] originalArray = {1, 2, 3, 4, 5};
		int leftIndex=0;
		int rightIndex = originalArray.length-1;
		
		while(leftIndex<rightIndex) {
			int temp=originalArray[leftIndex];
			originalArray[leftIndex]=originalArray[rightIndex];
			originalArray[rightIndex]=temp;
			
			leftIndex++;
			rightIndex--;
		}
		System.out.print(Arrays.toString(originalArray)+", ");
	}

}

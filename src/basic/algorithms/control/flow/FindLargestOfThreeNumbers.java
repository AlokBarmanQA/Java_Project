package basic.algorithms.control.flow;

import java.util.Arrays;

public class FindLargestOfThreeNumbers {

	public static void main(String[] args) {
		int a=20;
		int b=50;
		int c=30;
		findFromIndividualNumbers(a, b, c);
		int[] arr = {20, 50, 30};
		findFromArray(arr);
	}
	
	public static void findFromIndividualNumbers(int a, int b, int c) {
		
		if(a>b && a>c) {
			System.out.println(a +" is the greatest number");
		}
		else if(a>b && a<c) {
			System.out.println(c +" is the greatest number");
		}
		else {
			System.out.println(b +" is the greatest number");
		}
	}
	
	public static void findFromArray(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int lastNumber = arr[arr.length-1];
		System.out.println(lastNumber);
	}
}

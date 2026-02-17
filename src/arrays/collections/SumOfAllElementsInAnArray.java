package arrays.collections;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfAllElementsInAnArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		sumUsingTraditionLoop(arr);
		sumUsingJava8Stream(arr);
		sumUsingJava8IntStream(arr);
	}
	
	public static void sumUsingTraditionLoop(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			int num = arr[i];
			sum = sum + num;
		}
		System.out.println(sum);
	}

	public static void sumUsingJava8Stream(int[] arr) {
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
	}
	
	public static void sumUsingJava8IntStream(int[] arr) {
		int sum = IntStream.of(arr).sum();
		System.out.println(sum);
	}
}

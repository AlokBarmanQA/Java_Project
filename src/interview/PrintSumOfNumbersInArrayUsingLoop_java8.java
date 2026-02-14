package interview;

import java.util.stream.IntStream;

public class PrintSumOfNumbersInArrayUsingLoop_java8 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		sumOfNumbersInArrayUsingIntStream(arr);
	}

	public static void sumOfNumbersInArrayUsingIntStream(int[] arr) {
		
		int sum = IntStream.of(arr).sum();
		System.out.println(sum);
		
	}
}

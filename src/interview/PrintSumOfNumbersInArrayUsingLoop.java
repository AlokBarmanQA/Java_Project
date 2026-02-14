package interview;

public class PrintSumOfNumbersInArrayUsingLoop {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		sumOfNumbersInArrayUsingLoop(arr);
	}

	public static void sumOfNumbersInArrayUsingLoop(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}

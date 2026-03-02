package interview;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PrimeNumbersInArraySortedAscending {

	public static void main(String[] args) {
		Integer numbersArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 11 };
		Set<Integer> arraySet = new TreeSet<Integer>(Arrays.asList(numbersArray));
		for (Integer number : arraySet) {
			isPrime(number);
		}
		System.out.println("*********************************************************************");
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 14, 15, 16, 17, 19, 22, 23, 27, 29, 30 };
		Set<Integer> hs = new TreeSet<>();
		for (Integer num : arr) {
			if(isPrime(num)==true) {
				hs.add(num);
			}
		}
		System.out.println(hs);
	}

	public static boolean isPrime(int num) {
		// System.out.println(Math.sqrt(num));
		if (num <= 1) {
			System.out.println(num + " Not a prime number");
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					System.out.println(num + " is NOT a Prime number");
					return false;
				}
			}
		}
		System.out.println(num + " is a Prime number");
		return true;
	}
}

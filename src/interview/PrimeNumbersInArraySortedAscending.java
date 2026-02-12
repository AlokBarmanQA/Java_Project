package interview;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PrimeNumbersInArraySortedAscending {

	public static void main(String[] args) {
		Integer numbersArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 11 };
		Set<Integer> arraySet = new TreeSet<Integer>(Arrays.asList(numbersArray));
		for(Integer number:arraySet) {
			isPrime(number);
		}
	}
	
	public static boolean isPrime(int num) {
		if(num<=1) {
			System.out.println(num+" is not a Prime number");
			return false;
		}
		else {
			for(int i=2; i<=Math.sqrt(num); i++) {
				if(num%i==0) {
					System.out.println(num+" is not a Prime number");
					return false;
				}
			}
		}
		System.out.println(num+" is Prime number");
		return true;
	}
}

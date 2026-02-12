package tests;

import java.util.Set;
import java.util.TreeSet;

public class PrimeNumberFromArray3 {

	public static void main(String[] args) {
		
		int[] numbers = {17, 20, 19, 18, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
		Set<Integer> set = new TreeSet<Integer>();
		for(Integer number : numbers) {
			if(isPrimeNumber(number)) {
				System.out.println(number+ " is Prime");
				set.add(number);
			}
		}
		System.out.println("Prime numbers set: "+set);
	}
	
	public static boolean isPrimeNumber(int num) {
		if(num <=1) {
			System.out.println(num +" is not a prime nimber");
			return false;
		}
		for(int i=2; i*i<=num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}

}

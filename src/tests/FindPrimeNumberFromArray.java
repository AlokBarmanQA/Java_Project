package tests;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindPrimeNumberFromArray {

	public static void main(String[] args) {

		Integer numbers[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		for(int num:numbers) {
			boolean isPrime=true;
			if(num<=1) {
				System.out.println(num+" is not a Prime");
				isPrime = false;
			}
			else {
				for(int j=2; j<=Math.sqrt(num); j++) {
					if(num%j==0) {
						System.out.println(num+" not a Prime");
						isPrime=false;
						break;
					}
				}
				if(isPrime) {
					System.out.println(num+" is Prime");
				}
			}
		}
	}

}

package tests;

public class FindANumberIsPrimeOrNot {

	public static void main(String[] args) {
		//Easiest Way
		int num = 12;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		System.out.println(count);
		if (count == 2) {
			System.out.println(num + " Prime number");
		} else {
			System.out.println(num + " Not a Prime number");
		}
	}

}

package interview;

public class PrimeNumbersInArray {

	public static void main(String[] args) {

		int numberArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 11 };
		for (Integer number : numberArray) {
			isPrime(number);
		}
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

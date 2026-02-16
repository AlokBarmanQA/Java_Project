package basic.algorithms.control.flow;

public class NumberIsPrime {

	public static void main(String[] args) {
		System.out.println(isPrime(29));
		System.out.println(isPrime(28));
		int num = 27;
		if (isPrime(num)) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is NOT a prime number.");
		}
	}

	public static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}

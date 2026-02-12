package tests;

public class PrimeNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numbers[] = {19, 1, 17, 2, 16, 3, 15, 4, 13, 5, 6, 7, 9, 10, 12, 11};
		for(int num:numbers) {
			boolean isPrime = true;
			if(num<=1) {
				isPrime=false;
			}
			else {
				for(int i=2; i<=Math.sqrt(num); i++) {
					if(num%i==0) {
						isPrime=false;
						break;
					}
				}
			}
			if(isPrime) {
				System.out.println(num);
				//System.out.println(Math.sqrt(2));
			}
		}
	}

}

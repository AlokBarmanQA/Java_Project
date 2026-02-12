package tests;

public class FindPrimeNumberFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {11, 20, 3, 2, 19, 4, 18, 6, 17, 5, 16, 7, 15, 8, 12, 14, 10};
		int num;
		int count=0;
		for(int i=1; i<arr.length; i++) {
			num= arr[i];
			if(num<=1) {
				System.out.println(num+" == not a Prime number");
			}
			else {
				for(int j=2; j<arr.length; j++) {
					if(num % j == 0) {
						count++;
					}
				}
				if(count==2) {
					System.out.println(num+" is Prime number");
				}
				else {
					System.out.println(num+" is not a Prime number");
				}
			}
		}
	}

}

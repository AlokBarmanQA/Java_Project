package tests;

public class PrimeNumberFromArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {19, 1, 17, 2, 16, 3, 15, 4, 13, 5, 6, 7, 9, 10, 12, 11};
		for(int i=0; i<arr.length; i++) {
			int num = arr[i];
			//System.out.println("====="+arr[16]);
			int count=0;
			for(int j=1; j<=arr.length; j++) {
				if(num%j==0) {
					count++;
				}
			}
			//System.out.println(count);
			if(count==2) {
				System.out.println(num+" Prime number");
			}
			else {
				//System.out.println(num+" not a Prime number");
			}
		}
	}

}

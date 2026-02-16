package number.based.programs;

public class CountNumberOfEvenOddDigitsInANumber {

	public static void main(String[] args) {
		// Count Number Of EVEN & ODD Digits in A Number
		int number = 1234567890;
		
		int evenCount = 0;
		int oddCount = 0;
		
		if(number==0) {
			evenCount=1;
		}
		else {
			while(number != 0) {
				int lastDigit = number%10;
				if(lastDigit%2 == 0) {
					System.out.println(lastDigit + " is even number");
					evenCount++;
				}
				else {
					System.out.println(lastDigit + " is odd number");
					oddCount++;
				}
				number = number/10;
			}
		}
		System.out.println("Even Character Count: "+evenCount);
		System.out.println("Odd Character Count: "+oddCount);
	}

}

package onetime;

public class PrintTheOddNumbersFrom1To99 {

	public static void main(String[] args) {
		
		for(int num=1; num<=99; num++) {
			if(num%2 != 0) {
				System.out.println(num);
			}
		}

	}

}

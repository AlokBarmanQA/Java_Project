package basic.algorithms.control.flow;

public class SumOfDigitsInANumber {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		while(num != 0) {
			int lastdigit = num%10;
			sum = sum + lastdigit;
			num = num/10;
		}
		System.out.println(sum);
	}

}

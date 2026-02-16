package number.based.programs;

public class ReverseAnInteger {

	public static void main(String[] args) {
		int number = 12345;
		int reverse = 0;
		
		while(number !=0) {
			int lastDigit = number%10;//retrieve last digit
			reverse = reverse * 10 + lastDigit;//last digit entering from left side
			number = number/10;//excluding last digit from number
		}
		System.out.println(reverse);
	}

}

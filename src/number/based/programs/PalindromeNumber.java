package number.based.programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=848;
		int temp = Math.abs(num);
		int reverse=0;
		while(num != 0) {
			int lastdigit = num%10;
			reverse = reverse * 10 + lastdigit;
			num = num/10;
		}
		System.out.println(reverse);
		if(temp==reverse) {
			System.out.println(temp+" is a Palindrome number");
		}
		else {
			System.out.println(temp+" is Not a Palindrome number");
		}
	}

}

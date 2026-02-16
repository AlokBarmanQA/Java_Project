package number.based.programs;

public class FactorialOfANumber {

	public static void main(String[] args) {
		//5*4*3*2*1=120
		long number = 5;
		long factorial = 1;

		if (number <= 0) {
			System.out.println("Not Factorial Number");
		}
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
			//System.out.println(factorial);
		}
		System.out.println(factorial);
	}
}

package number.based.programs;

public class SwapTwoIntegers {

	public static void main(String[] args) {
		// Java Program to swap Two Integers
		
		//swapTwoNumbersUsingThirdVariable();
		
		swapTwoNumbersWithoutThirdVariable();
	}
	
	public static void swapTwoNumbersUsingThirdVariable() {
		int a = 10;
		int b = 20;
		int temp = 0;
		System.out.println("Before swap-a = "+a);
		System.out.println("Before swap-b = "+b);
		//System.out.println("Before swap-c = "+temp);
		temp=a;//10
		a=b;//20
		b=temp;//10
		System.out.println("After swap-a = "+a);
		System.out.println("After swap-b = "+b);
		//System.out.println("After swap-c = "+temp);
	}
	
	public static void swapTwoNumbersWithoutThirdVariable() {
		int a = 10;
		int b = 20;
		a=a+b;
		System.out.println("a = "+a);
		b=a-b;//30-20=10
		System.out.println("b = "+b);
		a=a-b;//30-10, b=10
		System.out.println("a = "+a);
	}
}

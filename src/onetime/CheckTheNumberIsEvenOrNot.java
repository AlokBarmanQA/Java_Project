package onetime;

public class CheckTheNumberIsEvenOrNot {

	public static void main(String[] args) {
		// Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd
		for(int num=0; num<=100; num++) {
			if(num%2 != 0) {
				System.out.println(num +" - 0.");
			}
			else {
				System.out.println(num +" - 1.");
			}
		}
	}

}

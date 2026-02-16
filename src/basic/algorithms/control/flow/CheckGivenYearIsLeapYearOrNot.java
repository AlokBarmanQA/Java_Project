package basic.algorithms.control.flow;

import java.time.Year;

public class CheckGivenYearIsLeapYearOrNot {

	public static void main(String[] args) {
		//A year is a leap year if it is divisible by 4, but not by 100, unless it is also divisible by 400.
		/*
		 * Example Test Cases 
		 * 2000: Leap Year (divisible by 400). 
		 * 1900: Not a Leap Year (divisible by 100 but not 400). 
		 * 2024: Leap Year (divisible by 4 and not 100).
		 * 2025: Not a Leap Year (not divisible by 4).
		 */
		CheckGivenYearIsLeapYearOrNotUsingTraditionalMethod();
		CheckGivenYearIsLeapYearOrNotUsingJava8();
	}
	
	public static void CheckGivenYearIsLeapYearOrNotUsingTraditionalMethod() {
		int year = 1900;
		if((year%4 == 0 && year%100 !=0) || year%400 == 0) {
			System.out.println(year+" is Leap year");
		}
		else {
			System.out.println(year+" is NOT Leap year");
		}
	}
	
	public static void CheckGivenYearIsLeapYearOrNotUsingJava8() {
		int year = 1980;
		boolean flag = Year.isLeap(year);
		if(flag) {
			System.out.println(year+" is Leap year");
		}
		else {
			System.out.println(year+" is NOT Leap year");
		}
	}

}

package dailypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DailyPracticeHere {

	public static void main(String[] args) {
		// 1. Java Program to Count Number of Digits
		// 2. Java Program To Swap Two Integers
		// 3. Java Program to Count Number of Even and Odd digits
		// 4. Java Program Fibonacci Series
		// 5. Java Program To Reverse An Integer
		// 6. Java Program to Find Factorial Of A Number
		// 7. Java Program To Convert Integer To Octal
		// 8. Java Program To Find Palindrome Number
		// Reverse a string without using an inbuilt reverse method.
		// Check if a string is a palindrome.
		// Find duplicate characters or count occurrences of each character in a string.
		// Remove all spaces from a string.
		// Check if two strings are anagrams.
		// (Anagrams have the same characters with the same frequencies, just in a
		// different order)
		// Find the second largest number in an integer array.
		// Remove duplicate elements from an array or an ArrayList.
		// Find the missing number in an array of 1 to N.
		// Generate the Fibonacci series up to N terms. 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 ,
		// Check if a number is prime.
		//Swap two numbers without using a third variable. 
		int num =5050;
		int evenCount = 0;
		int oddCount=0;
		while(num !=0) {
			int lastDigit = num%10;
			if(lastDigit%2==0) {
				
				evenCount++;
			}
			else {
				oddCount++;
			}
			num = num/10;
		}
		System.out.println("Even numbers count: "+evenCount);
		System.out.println("Odd numbers count: "+oddCount);
	}
	

}

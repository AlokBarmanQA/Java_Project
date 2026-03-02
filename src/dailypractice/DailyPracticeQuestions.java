package dailypractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DailyPracticeQuestions {

	public static void main(String[] args) {
		//Find the missing number in an array of 1 to N.
		//Generate the Fibonacci series up to N terms. 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 ,
		//Find the second largest number in an integer array.
		//Java Program to Find Factorial Of A Number
		//Java Program To Reverse An Integer
		//Java Program to Count Number of Even and Odd digits
		//Reverse a string without using an inbuilt reverse method.
		//Check if a string is a palindrome.
		//Find duplicate characters or count occurrences of each character in a string.
		//Remove duplicate elements from an array or an ArrayList.
		//Check if two strings are anagrams.
		//(Anagrams have the same characters with the same frequencies, just in a different order)
		//Check if a number is prime.
		//1*2*3*4*5
		String str1 = "madam";
		String str2 = " a a m m d";
		str1=str1.replaceAll("\\s", "");
		str2=str2.replaceAll("\\s", "");
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
//		Arrays.sort(str2.toCharArray());
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean flag = Arrays.equals(arr1, arr2);
		System.out.println(flag);
	}
	

}

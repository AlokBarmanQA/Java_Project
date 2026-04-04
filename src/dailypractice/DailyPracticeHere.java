package dailypractice;

import java.util.Scanner;

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
		Scanner scan = new Scanner(System.in);
		int i = 12;
		double d = 4.0;
		String s = "HackerRank ";
		
        int sum = i+scan.nextInt();
        double dsum = d+scan.nextDouble();
        scan.nextLine();
        String input = scan.nextLine();
        System.out.println(sum);
        System.out.println(dsum);
        System.out.println(s+input);
        scan.close();

	}

	public static boolean isAlphabeticPalindrome(String code) {
		String updatedcode = code.replaceAll("[^A-Z,a-z]", "").toLowerCase();
		String original = updatedcode;
		String reverse = "";
		if (updatedcode == "") {
			return false;
		}
		for (int i = updatedcode.length() - 1; i >= 0; i--) {
			char c = updatedcode.charAt(i);
			reverse += c;
		}
		System.out.println(reverse);
		if (reverse.equals(original)) {
			System.out.println(reverse + " is Palindrome");
			return true;
		}
		return false;
	}

}

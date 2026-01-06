package tests;

public class Test1 {
	
	public static void main(String[] args) {
		String input = "Madan";
		String temp = input;
		String reverse = "";
		for(int i=input.length()-1; i>=0; i--) {
			reverse = reverse + input.charAt(i);
			System.out.println(i);
		}
		
		if(reverse.equalsIgnoreCase(temp)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}
	}
}

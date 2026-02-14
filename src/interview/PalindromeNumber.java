package interview;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		String str = "MADAM";
		String reverse = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			reverse = reverse+str.charAt(i);
		}
		System.out.println(reverse);
		System.out.println(">>>"+(str=reverse));
		System.out.println(str==reverse);
		if(str.equals(reverse)) {
			System.out.println(str+" is PALINDROME");
		}
		else {
			System.out.println(str+" is NOT PALINDROME");
		}
	}

}

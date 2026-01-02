package tests;

public class PalindromeWord {

	public static void main(String[] args) {
		//proof that MADAM is a palindrome Word BOB, CIVIC, DAD, EVE, LEVEL, EYE
		String word = "MADAM";
		System.out.println("================Normal Order==============");
		for(int a = 0; a<word.length(); a++) {
			//System.out.println(word.length());
			char character[] = word.toCharArray();
			//System.out.println(a);
			//System.out.println(character[a]);
			System.out.println("index="+a+"----- Character="+character[a]);
		}
		System.out.println("================Reverse Order==============");
		for(int a = word.length()-1; a>=0; a--) {
			//System.out.println(word.length());
			char character[] = word.toCharArray();
			//System.out.println(a);
			//System.out.println(character[a]);
			System.out.println("index="+a+"----- Character="+character[a]);
		}

	}

}

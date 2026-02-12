package tests;

public class HowToPrintCharactersFromAString {

	public static void main(String[] args) {
		String word = "ALOK";
		System.out.println("=========Using Char Array=======");
		for (int a = 0; a < word.length(); a++) {
			char character[] = word.toCharArray();
			System.out.println("index=" + a + "----- Character=" + character[a]);
		}
		System.out.println("=========Using CharAt=======");
		for (int a = 0; a < word.length(); a++) {
			char ch = word.charAt(a);
			System.out.println(ch);
		}
		System.out.println("=========Reverse Word=======");
		for (int a = word.length()-1; a >=0; a--) {
			char ch = word.charAt(a);
			System.out.println(ch);
		}
	}
}
package tests;

public class HowToPrintCharactersFromAString {
	public void Main() {
		String word = "ALOK";
		for(int a = 0; a<word.length(); a++) {
			char character[] = word.toCharArray();
			//System.out.println(a);
			//System.out.println(character[a]);
			System.out.println("index="+a+"----- Character="+character[a]);
		}
	}
}
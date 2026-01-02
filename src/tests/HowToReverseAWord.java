package tests;

public class HowToReverseAWord {
	public static void main(String[] args) {
		String word = "ALOK";
		for(int a = word.length()-1; a>=0; a--) {
			//System.out.println(word.length());
			char character[] = word.toCharArray();
			//System.out.println(a);
			//System.out.println(character[a]);
			System.out.println("index="+a+"----- Character="+character[a]);
		}
	}
}
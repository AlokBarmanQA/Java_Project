package interview;

public class CountNumberOfWordsInString {

	public static void main(String[] args) {
		String str = "Alok Kumar Barman";
		String[] words = str.split(" ");
		System.out.println("Number of words: "+words.length);
	}

}

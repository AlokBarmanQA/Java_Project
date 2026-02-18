package searching.algorithms;

public class GenerateAllSubstringsFromAGivenString {

	public static void main(String[] args) {
		//String inputString = "abc";
		String inputString = "abcabcbb";
		int count = inputString.length();
		for(int i=0; i<count; i++) {
			for(int j=(i+1); j<=count; j++) {
				String sub = inputString.substring(i, j);
				System.out.println(sub);
			}
		}

	}

}

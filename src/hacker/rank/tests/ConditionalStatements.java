package hacker.rank.tests;

public class ConditionalStatements {

	public static void main(String[] args) {
		int i=100;
		for(int n=1; n<=i; n++) {
			if(n%2 != 0) {
				System.out.println("Weird");
			}
			else {
				if(n>=2 && n<=5) {
					System.out.println("Not Weird");
				}
				else if(n>=6 && n<=20) {
					System.out.println("Weird");
				}
				else {
					System.out.println("Not Weird");
				}
			}
		}
		
	}

}

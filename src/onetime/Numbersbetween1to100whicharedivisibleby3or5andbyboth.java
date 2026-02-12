package onetime;

public class Numbersbetween1to100whicharedivisibleby3or5andbyboth {

	public static void main(String[] args) {
		
		System.out.println("Numbers divided by 3: ");
		for(int num=1; num<=100; num++) {
			if(num%3 == 0) {
				System.out.println(num);
			}
		}
		System.out.println("Numbers divided by 5: ");
		for(int num=1; num<=100; num++) {
			if(num%5 == 0) {
				System.out.println(num);
			}
		}
		System.out.println("Numbers divided by 3 and 5: ");
		for(int num=1; num<=100; num++) {
			if(num%3 == 0 && num%5 == 0) {
				System.out.println(num);
			}
		}
	}

}

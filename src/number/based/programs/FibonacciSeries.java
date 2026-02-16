package number.based.programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		int totalTerm = 9;
		int a = 0;
		int b = 1;
		for(int i=1; i<=totalTerm; i++) {
			//System.out.println("Fabonacci Series: \");
			System.out.print(a + " , ");
			int sum = a + b;
			a = b;
			b = sum;
		}

	}

}

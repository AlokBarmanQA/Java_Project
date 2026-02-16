package number.based.programs;

public class ConvertIntegerToOctal {

	public static void main(String[] args) {
		
		convertIntegerToOctalUsingBuiltinMethod();
		
		System.out.println("==================");
		
		for (int i = 0; i <= 40; i++) {
			System.out.println(i+" in octal is "+convertIntegerToOctalUsingForLoop(i));
		}
	}

	public static void convertIntegerToOctalUsingBuiltinMethod() {
		int decimalNumber = 120;
		String octalString = Integer.toOctalString(decimalNumber);

		System.out.println("Decimal Integer: " + decimalNumber);
		System.out.println("Octal String: " + octalString);
	}

	public static int convertIntegerToOctalUsingForLoop(int decimalNumber) {
		// int num = 101111;
		String octal = "";
		if (decimalNumber == 0) {
			return 0;
		}
		while (decimalNumber != 0) {
			int lastDigit = decimalNumber % 8;
			octal = lastDigit + octal;
			decimalNumber = decimalNumber / 8;
		}
		// System.out.println(decimalNumber + " decimal number convert to octal is "
		// +Integer.parseInt(octal));
		return Integer.parseInt(octal);
	}
}

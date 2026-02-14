package interview;

public class EqualDoubleEqualOperatorEqualsMethod {

	public static void main(String[] args) {
		//1.  Single = is for assignment
		//= (Assignment Operator): Used to assign a value to a variable or a reference to an object. It is not for comparison.
		int a = 10;
		String n1 = "hello"; // Assigns "hello" literal reference to s1
		String n2 = n1;     // s2 now refers to the same object as s1
		System.out.println(a);
		System.out.println(n2);
		
		//2. == (Equality Operator): Used for comparison, but its behavior differs for primitive types and objects.
		/*For primitives (e.g., int, char, boolean): Compares the actual values.*/
		int a1 = 10;
		int b1 = 10;
		System.out.println(a1 == b1); // true, because values are the same
		
		
		/*For objects/reference types (e.g., String, custom classes): Compares the memory addresses (references) to check 
		if both variables point to the exact same object instance in memory.*/
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1 == str2); // false, because str1 and str2 are two different objects in memory
		String str3 = str1;
		System.out.println(str1 == str3); // true, because str1 and str3 refer to the same object
		
		//3. equals() Method: Used for comparison to check for logical equality or content equality between objects.
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1.equals(s2)); // true, because the *contents* of the strings are the same

		importantToRemenber();
	}
	
	public static void importantToRemenber() {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = str1;
		System.out.println(str1==str2);			//false
		System.out.println(str1.equals(str2));	//true
		System.out.println(str1==str3);			//true
	}

}

package stringExamples;

public class StringAreImmutable {

//the concept of .equals() and == operator
//In Java, the equals() method and the == operator are used to compare objects.
//The main difference is that string equals() method compares the content equality of two strings 
//while the == operator compares the reference or memory location of objects in a heap, whether they point to the same location or not.
	public static void main(String[] args) {

		String s1 = "HELLO";//String pool
		String s2 = "HELLO";//String pool
		String s3 = new String("HELLO");//Heap memory

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
//Output
//	true
//	false
//	true
//	true
}

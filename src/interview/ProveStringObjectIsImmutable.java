package interview;

public class ProveStringObjectIsImmutable {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = s1;
		System.out.println("Before modification:");
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s1 == s2: " + (s1==s2));
		
		System.out.println("After modification:");
		s1 = s1.concat(" Programming");
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s1 == s2: " + (s1==s2));
		
		/*
		Output:
		Before modification:
			s1: Java
			s2: Java
			s1 == s2: true
		After modification:
			s1: Java Programming
			s2: Java
			s1 == s2: false
		 * */
	}

}

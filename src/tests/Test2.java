package tests;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		
		String s[] = {"h","e","l","l","o"};
		List<String> list = new LinkedList<>(Arrays.asList(s));
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

}

package arrays.collections;

import java.util.HashSet;
import java.util.Set;

public class CheckIfBothHashSetsAreEqual {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(3);
		set1.add(2);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		
		Set<Integer> set3 = new HashSet<>();
		set3.add(1);
		set3.add(2);
		set3.add(4);
		
		
		System.out.println(set1.equals(set2));
		
		System.out.println(set1.equals(set3));
	}

}

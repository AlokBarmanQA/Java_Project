package arrays.collections;

import java.util.ArrayList;
import java.util.List;

public class IndexOfSpecificElementInArrayList {

	public static void main(String[] args) {
		findElementFronStringArray();
		findElementFronIntegerArray();
	}

	public static void findElementFronStringArray() {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Apple");
		list.add("Grape");
		
		String targetElement = "Orange";
		String nonExistingElement = "Mango";
		
		int index1 = list.indexOf(targetElement);
		int index2 = list.indexOf("Apple");
		int index3 = list.indexOf(nonExistingElement);
		
		System.out.println(index1);
		System.out.println(index2);
		System.out.println(index3);
	}
	
	public static void findElementFronIntegerArray() {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);
		
		System.out.println(list.indexOf(20));
		System.out.println(list.indexOf(30));
		System.out.println(list.indexOf(50));
		
		
	}
}

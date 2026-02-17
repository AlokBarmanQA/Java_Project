package arrays.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortAnArrayAndRemoveDuplicates {

	public static void main(String[] args) {
		String[] names = {"Zoe", "Adam", "Charles", "Bella", "Nrityam", "Alok", "Zoe", "Adam", "Charles", "Bella", "Nrityam"};
		sortingUsingHashSet(names);
		System.out.println("=========================");
		sortingUsingTreeSet(names);
	}

	public static void sortingUsingHashSet(String[] names) {
		Set<String> hs = new HashSet<>();
		for(String name:names) {
			hs.add(name);
		}
		System.out.println(Arrays.toString(names));
		System.out.println(hs);
		List<String> list = new ArrayList<>();
		list.addAll(hs);
		System.out.println(list);
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
	}
	
	public static void sortingUsingTreeSet(String[] names) {
		Set<String> set = new TreeSet<>();
		for(String name:names) {
			set.add(name);
		}
		System.out.println(Arrays.toString(names));
		System.out.println(set);
	}
}

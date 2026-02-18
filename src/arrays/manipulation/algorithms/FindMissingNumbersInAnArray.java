package arrays.manipulation.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FindMissingNumbersInAnArray {

	public static void main(String[] args) {
		int arr[] = {5, 6, 7, 8, 8, 9, 1, 2, 3, 3, 10, 11, 13, 20, 14, 18, 16};
//		int smallestNumber=1;
//		int highestNumber=9;
		
		TreeSet<Integer> treeset = new TreeSet<>();
		for(Integer num:arr) {
			treeset.add(num);
		}
		System.out.println(treeset);
		
		List<Integer> list = new ArrayList<>();
		for(int i=treeset.first(); i<=treeset.last(); i++) {
			if(!treeset.contains(i)){
				System.out.println("Missing number: "+i);
				list.add(i);
			}
		}
		System.out.println(list);
	}

}

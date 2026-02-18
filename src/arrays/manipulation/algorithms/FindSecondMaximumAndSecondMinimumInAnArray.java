
package arrays.manipulation.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FindSecondMaximumAndSecondMinimumInAnArray {
	
	public static void main(String[] args) {
		int[] array = {23, 36, 96, 78, 55, 36};
        //int[] array2 = {78, 45, 19, 73, 55, 96};
        
		TreeSet<Integer> set = new TreeSet<>();
        for(Integer num:array) {
        	set.add(num);
        }
        System.out.println(set);
        
        List<Integer> list = new ArrayList<>();
        for(Integer num:set) {
        	list.add(num);
        }
        System.out.println(list);
        int secondMinimum = list.get(1);
        int secondMaximum = list.get(list.size()-2);
        
        System.out.println(secondMinimum);
        System.out.println(secondMaximum);
	}
}

package arrays.manipulation.algorithms;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsGreaterThanGivenValue {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(25);
        list.add(5);
        list.add(40);
        list.add(15);
        list.add(50);
        
        int givenValue = 20;
        
        System.out.println(list);
        
        list.removeIf(element -> element > givenValue);
        System.out.println(list);
	}

}

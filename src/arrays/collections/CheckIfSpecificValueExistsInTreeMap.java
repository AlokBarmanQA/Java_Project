
package arrays.collections;

import java.util.Map;
import java.util.TreeMap;

public class CheckIfSpecificValueExistsInTreeMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();
		map.put("java", 1);
		map.put("Csharp", 2);
		map.put("Rubi", 3);
		System.out.println(map);
		
		boolean value2 = map.containsValue(2);
		System.out.println(value2);
		
		boolean value4 = map.containsValue(4);
		System.out.println(value4);
	}

}

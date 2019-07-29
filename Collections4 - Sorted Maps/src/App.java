import java.util.*;

public class App {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedhHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treehMap = new TreeMap<Integer, String>();
		
		testMap(hashMap);
		
		testMap(linkedhHashMap);
		
		testMap(treehMap);

	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(9,  "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "girrafe");
		map.put(0, "swan");
		map.put(6, "bear");
		map.put(28, "snake");
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
		
		System.out.println();
	}


}

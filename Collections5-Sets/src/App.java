import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<String>();
		
		Set<String> set2 = new TreeSet<String>();
		
		if(set1.isEmpty()) {
			System.out.println("no data availiable");
		}
		putInList(set1);
		
		System.out.println(set1);
		
		set2.add("elephant");
		set2.add("tiger");
		set2.add("mouse");
		set2.add("snake");
		
		set2.add("bat");
		
		Object[] a = new Object[set1.size()];
		a = set1.toArray();
		System.out.println();
		for(int i = 0; i < set1.size(); i++) {
			System.out.println(a[i]);
		}
		
		Set<String> intersection = new HashSet<String>(set1);
		System.out.println(intersection);
		
		if(intersection.retainAll(set2)) {
			System.out.println(intersection);
		}
		
		Set<String> difference = new HashSet<String>(set1);
		if(difference.removeAll(set2)) {
			System.out.println(difference);
		}
	}
	
	static void putInList(Set<String> set) {
		set.add("dog");
		set.add("cat");
		set.add("mouse");
		set.add("bear");
		
		set.add("mouse");
	}


}

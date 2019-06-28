import java.util.*;

public class App {

	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");
		
		Iterator<String> it = animals.iterator();
		while(it.hasNext()) {
			String value = it.next();
			System.out.println(value);
			
			if(value.contentEquals("cat")) {
				it.remove();
			}
		}
		
		System.out.println();
//		String animal = it.next();
//		System.out.println(animal);
//		LinkedList<String> it = (LinkedList<String>) animals.iterator();

		
		for(String animal: animals) {
			System.out.println(animal);
			
		}
	}

}

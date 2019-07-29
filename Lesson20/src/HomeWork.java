import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork {

	public static void main(String[] args) {
		String[] strings = {"A", "B", "C", "F", "A", "C"};
		for(String s: strings) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		System.out.println(abc(strings).toString());
	}
	
	static ArrayList<String> abc(String ...strings ) {
		ArrayList<String> aR1 = new ArrayList<String>();
		for(String s: strings) {
			aR1.add(new String(s));
		}
		if(!aR1.isEmpty()) {
			aR1.sort(null);
		}
		
		for(int i =0; i<aR1.size()-1; i++) {
			if(aR1.get(i).equals(aR1.get(i+1))) {
				aR1.remove(i);
				i--;
			}
		}
		
		return aR1;
	}

}

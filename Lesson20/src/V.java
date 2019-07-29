import java.util.*;

public class V {

	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList<>(30);
		String[] myStrings1 = { "ABC", "DEF" };
		String[] myStrings2 = { "GHJ", "KLM", "NOP" };

		list.add(myStrings1[0]);
		list.add(myStrings1[1]);
		
		list.add(myStrings2[1]);
		
		for(String a: list) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		list.add(0, myStrings2[2]);
		
		for(String a: list) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		list.add(4, myStrings2[0]);
		
		for(String a: list) {
			System.out.print(a + " ");
		}
		
		list.add(5, myStrings2[0]);
		
		System.out.println();
		
		System.out.println(list.get(5));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		list.set(0, "ÀÁÂ");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
	}

}

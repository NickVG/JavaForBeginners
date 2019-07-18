import java.util.*;
public class B {

	public static void main(String[] args) {
		ArrayList<StringBuilder> list = new ArrayList<>();
		StringBuilder sb1 = new StringBuilder("ABC");
		StringBuilder sb2 = new StringBuilder("DEF");
		StringBuilder sb3 = new StringBuilder("GHJ");
		
		list.add(sb1);
		list.add(sb2);
		list.add(sb3);
		for(StringBuilder i: list) {
			i.append("!!!");
		}
		
		for(StringBuilder i: list) {
			System.out.println(i);
		}
		
		list.remove(2);
		
		for(StringBuilder i: list) {
			System.out.println(i);
		}
		
		list.remove(new String("ABC"));
		System.out.println();
		for(StringBuilder i: list) {
			System.out.println(i);
		}
		

	}

}

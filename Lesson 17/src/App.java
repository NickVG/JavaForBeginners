
public class App {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("Good day, Commander!");
		StringBuilder sb21 = new StringBuilder("Good day, Commander!");
		StringBuilder sb3 = new StringBuilder(50);
		StringBuilder sb4 = new StringBuilder(sb3);
		
		System.out.println(sb4.toString() == sb3.toString());
		System.out.println(sb3.toString().equals(sb4.toString()));
		
		System.out.println(sb2.charAt(6));
		
		System.out.println(sb2.append(new Car()));
		
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());
		System.out.println(sb1.capacity());
		
		String s = null;
		
		System.out.println(sb2.append(" bla-bla-bla"));
		s = sb2.append(" bla-bla-bla").substring(sb2.indexOf("oo"), sb2.indexOf(" "));
		
		System.out.println(s);
		
		System.out.println(sb2.append(" bla-bla-bla").substring(sb2.indexOf("oo"), sb2.indexOf(" ")));
		
		Car car1 = new Car();
		System.out.println(car1.ravenstvo(sb2,sb21));

	}
}
	
class Car {
	public boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
		
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		if (s1.equals(s2)) {
			return true;
		}
		return false;
	
	}
}
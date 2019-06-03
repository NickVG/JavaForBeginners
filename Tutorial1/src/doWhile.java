import java.util.Scanner;

class Frog {
	
	public int id;
	public String name;
	public String toString() {
		StringBuilder sb = new StringBuilder();
//		sb.append(id).append(": ").append(name);
		return sb.append(id).append(": ").append(name).toString();
		
	}
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class doWhile {

	public static void main(String[] args) {
		Frog frog1 = new Frog(1, "Dunya");
		Frog frog2 = new Frog(3, "Vanya");
		
		System.out.println(frog1);
		System.out.println(frog2);
	}
}

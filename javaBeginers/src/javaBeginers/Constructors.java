package javaBeginers;

class Machine {
	private String name;
	private int code;
	
	public Machine() {
		this("Arnie", 0);
		
		System.out.println("Constructor is running");
	}
	
	public Machine(String name) {
		this(name, 0);
		
		System.out.println("Second Constructor is running");
		this.name = name;
	}
	
	public Machine(String name, int code) {
		
		System.out.println("Third Constructor is running");
		this.name = name;
		this.code = code;
	}

}
public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine arnie = new Machine();
//		Machine bertie = new Machine("bertie");
//		Machine bender = new Machine("bender", 3);
	}

}

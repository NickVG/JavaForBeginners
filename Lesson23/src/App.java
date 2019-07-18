
public class App {
	void abc(Animal a) {
		System.out.println("A");
	}
	void abc(Mouse m) {
		System.out.println("M");
	}
	public static void main(String[] args) {
		App app = new App();
		Animal an = new Mouse();
		app.abc(an);
		an.getName();

	}

}

class Animal{
	void getName() {
		System.out.println("Animal");
	}
	
}

class Mouse extends Animal{
	void getName() {
		System.out.println("Mouse");
	}
}
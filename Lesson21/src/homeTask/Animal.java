package homeTask;

public class Animal {
	protected int eyes;

	Animal() {
		System.out.println("I'm animal");
	}

	void eat() {
		System.out.println("Animal eats");
	}

	void drink() {
		System.out.println("Animal drinks");
	}

}

class Pet extends Animal {
	int tail = 1;
	int paw = 4;

	Pet() {
		System.out.println("I'm Pet");
		this.eyes = 2;
	}

	void run() {
		System.out.println("Pet runs");
	}

	void jump() {
		System.out.println("Pet jumps");
	}
}

class Dog extends Pet {
	Dog(String name) {
		System.out.println("I am a dog and my name is: " + name);
	}
	
	void play() {
		System.out.println("Dog plays");
	}
}

class Cat extends Pet{
	Cat(String name) {
		System.out.println("I am a cat and my name is: " + name);
	}
	
	void sleep() {
		System.out.println("Cat sleeps");
	}
}
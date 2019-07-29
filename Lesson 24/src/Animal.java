
public abstract class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	abstract void eat();
	abstract void sleep();
}


 abstract class Fish extends Animal {
	
	 public Fish(String name) {
		 super(name);
		 this.name = name;
	}
	
	
	
	public void sleep() {
		System.out.println("Vsegda interesno nablyudat', kak spyat ribi");
	}
	abstract void swim();
}
 
 
 abstract class Bird extends Animal implements Speakable {
	 String name;
	 public Bird(String name) {
		 super(name);
		 this.name = name;
	}
	 public void speak() {
		 System.out.println(name + " sings...");
	 }
	 
	 abstract void swim();
 }
 abstract class Mammal extends Animal implements Speakable {
	 String name;
	 public Mammal(String name) {
		 super(name);
		 this.name = name;
	 }
	 abstract void run();
 }
 
 interface Speakable{
	 default void speak() {
		 System.out.println("Somebody speaks...");
	 }
 }
 
 class Mechenosec extends Fish{
	 
	 Mechenosec (String name){
		 super(name);
		 this.name = name;
	 }
	 void swim() {
		 System.out.println("Mechenosec krasivaya ryba, kotoraya bistro plavaet");
	 }
	 void eat() {
		 System.out.println("This Fish is not *** and it eats common fish food!");
	 }
 }
 
 class Pingvin extends Bird{
	 String name;
	 public Pingvin(String name) {
		 super(name);
		 this.name = name;
	 }
	 void eat() {
		 System.out.println("The Pinguin likes fish!");
	 }
	 void sleep() {
		 System.out.println("Pinguins are sleep together");
	 }
	 void fly() {
		 System.out.println("Pinguins can not fly");
	 }
	 public void speak() {
		 System.out.println("Pinguins can not sing :-( ...");
	 }
	 void swim() {
		 System.out.println("Pinguins are swimers!!!");
	 }
 }
 
 class Lev extends Mammal{
	 String name;
	 public Lev(String name) {
		 super(name);
		 this.name = name;
	 }
	 void eat() {
		 System.out.println("Lion likes meat like any other predator!");
	 }
	 void sleep() {
		 System.out.println("Lions are dreaming all day long");
	 }
	 void run() {
		 System.out.println("The Lion is not the fastest cat");
	 }
	 
 }
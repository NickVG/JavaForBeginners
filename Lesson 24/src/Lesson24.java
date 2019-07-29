
public class Lesson24 {

	public static void main(String[] args) {
		Mechenosec mech = new Mechenosec("Mechenosec");
		System.out.println(mech.name);
		mech.eat();
		mech.sleep();
		mech.swim();
		System.out.println();
		Speakable pin = new Pingvin("Pin");
		pin.speak();
		System.out.println();
		Animal lev = new Lev("The Lion");
		System.out.println(lev.name);
		lev.eat();
		lev.sleep();
		System.out.println();
		Mammal lev2 = new Lev("little lion");
		lev2.eat();
		lev2.run();
		lev2.sleep();
		lev2.speak();
		
		Speakable[] sp1;
		Animal[] an1;
	}

}

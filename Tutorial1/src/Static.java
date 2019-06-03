/**
 * 
 */

/**
 * @author nv.gorbunov
 *
 */

class Thing {
	public String name;
	public static String description;
	
	public void showName() {
		System.out.println(description + ": " + name);
	}
	
	public static void showInfo() {
		System.out.println("Hello");
	}
}



public class Static {

	public static void main(String[] args) {
/*		int[] values;
		values = new int[3];
		System.out.println(Arrays.toString(values));
		
		Strings();
*/		
		Thing.description = "I'm a thing";
		
		Thing.showInfo();
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		
		System.out.printf("Total cost %d\n", 5);
		System.out.printf("Total cost %d;\nquantity is %d\n", 5, 120);
		
		for (int i = 0; i < 11; i++) {
			System.out.printf("%-3d: some text\n", i * 10);
			System.out.printf("Total value: %f\n", 5.6);
			System.out.printf("Total value: %6.2f\n", 325.6501);
		}
		
		Machine mach3 = new Machine();
		
		mach3.start();
		mach3.stop();

	}
}


package dividebyzero;

public class DivideByZero {
	public static void main(String args[]) {
		int d, a;
		try { //control code block
			d = 0;
			a = 42 / d;
			System.out.println("This will not be shown");
		} catch (ArithmeticException e) { //catch error
			System.out.println("Dividing by zero");
		}
		System.out.println("After operator catch");
	}
}


public class App {

	public static void main(String[] args) {
		int value = 4;
//		calculate(value);
		
		System.out.println("�������� �� " +  value + "! �������� : " + factorial(4));
	}
	
	private static int factorial(int value) {
//		System.out.println("Hello " + value);
		
		if(value == 1) {
			new Exception().printStackTrace();
			return 1;
		}
//		new Exception().printStackTrace();
		return factorial(--value) * value;
//		value--;
//		System.out.println("Now I took 1 from you... MWA-HA-HA " + value);
	}

}

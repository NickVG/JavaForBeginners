
public class App {

	public static void main(String[] args) {
//		int value = 7;
//		value = value / 0;
		
		String[] text = {"omne", "two", "three"};
		try {
			System.out.println(text[3]);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
				
	}

}

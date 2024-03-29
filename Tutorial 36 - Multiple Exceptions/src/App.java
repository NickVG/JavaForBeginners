import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {

	public static void main(String[] args) throws IOException, ParseException {
		Test test = new Test();
		
		/*try {
			test.run();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Fail 1");
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("Fail 2");
		}*/
		
/*		try {
			test.run();
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}*/
		
		try {
			test.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			test.input();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

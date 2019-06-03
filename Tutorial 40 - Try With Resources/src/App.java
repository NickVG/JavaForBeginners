

class Temp implements AutoCloseable {
	
	@Override
	public void close() throws Exception {
		System.out.println("Closnig...");
	}
	
	
}

public class App {

	public static void main(String[] args) {
		
/*		try {
			temp.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
*/
		try( Temp temp = new Temp()) {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

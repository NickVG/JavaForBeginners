
public class App {

	public static void main(String[] args) {
		Camera cam1 = new Camera();
		cam1.setId(01);
		
		Car car1 = new Car();
		car1.setId(02);
		
		cam1.run();
		car1.run();

	}

}

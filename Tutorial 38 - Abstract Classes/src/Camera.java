
public class Camera extends Machine {
	@Override
	public void start() {
		System.out.println("Camera is started.");
	}
	
	@Override
	public void doStuff() {
		System.out.println("Camera is making photo.");
	}
	
	@Override
	public void shutdown() {
		System.out.println("Camera is shutting down....");
	}

}

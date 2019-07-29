
public class Car extends Machine{
	@Override
	public void start() {
		System.out.println("Car is started.");
	}
	
	@Override
	public void doStuff() {
		System.out.println("Car is driving.");
	}
	
	@Override
	public void shutdown() {
		System.out.println("Car is shutting down....");
	}
}

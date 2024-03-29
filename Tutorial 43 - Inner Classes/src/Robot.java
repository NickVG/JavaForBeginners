
public class Robot {
	private int id;

	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}

	public Robot(int id) {
		this.id = id;
	}

	public void start() {
		System.out.println("Starting robot " + this.id);

		Brain brain = new Brain();
		brain.think();
		
		final String name = "Robo";
		class Temp {
			public void doSmth() {
				System.out.println("ID is: " + id);
				System.out.println("My name is " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSmth();
	}
	
	static class Battery {
		public void charge() {
			System.out.println("Battery is charging...");
		}
	}
}

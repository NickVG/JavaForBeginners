package homeTask;

class Test {
	public static void main(String[] args) {
		Student std = new Student();
		std.setName("Va");
		std.setGrade(11);
		std.setCourse(53);
		
		std.showInfo();
		Dog dog = new Dog("Jack");
		System.out.println("Dog has " + dog.paw + " paws");
		
		Cat cat = new Cat("Vas'ka");
		cat.sleep();
	}

	
}

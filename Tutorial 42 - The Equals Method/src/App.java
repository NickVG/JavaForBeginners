class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [id = " + id + "name = " + name + "]";
	}
}

public class App {

	public static void main(String[] args) {
		Person person1 = new Person(5, "Bob");
		Person person2 = new Person(5, "Bob");
		
		person1 = person2;
		System.out.println(person1  == person2);
		
		String text1 = "Hello";
		String text2 = "Hellosdfdsfsdfcsdcdscsdc".substring(0, 5);
		
		System.out.println(text1 == text2);
	}

}

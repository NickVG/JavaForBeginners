import java.io.*;


public class Person implements Serializable {
	
	private static final long serialVersionUID = 11231245434534634L;
	
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name = " + name + "]";
	}

}

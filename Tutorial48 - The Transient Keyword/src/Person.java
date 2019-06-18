import java.io.*;

public class Person implements Serializable {
	
	public static final long serialVersionUID = 12342143245L;
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;

	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ",  name=" + name + "]";
	}

}

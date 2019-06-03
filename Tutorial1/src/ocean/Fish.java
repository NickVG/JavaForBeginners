package ocean;

public class Fish {
	String name;
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
//		sb.append(id).append(": ").append(name);
		return sb.append("the name ").append(": ").append(this.name).toString();
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public Fish (String name) {
		setName(name);
	}
}

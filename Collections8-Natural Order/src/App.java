import java.util.*;

class Person implements Comparable<Person>{
	String name;
	public Person (String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	@Override
	public int compareTo(Person person) {
		int len1 = name.length();
		int len2  = person.name.length();
		
		if(len1 > len2) {
			return 1;
		}
		
		if(len1 < len2) {
			return -1;
		}
		else {
			return name.compareTo(person.name);
		}
//		return -name.compareTo(person.name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}



public class App {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		SortedSet<Person> set = new TreeSet<Person>();

		addElements(list);
		addElements(set);
		

		
		
		Collections.sort(list);
		showElements(list);
		System.out.println();
		
		showElements(set);
	}

	private static void addElements(Collection<Person> col) {
		col.add(new Person("Joe"));
		col.add(new Person("Sue"));
		col.add(new Person("Juliet"));
		col.add(new Person("Clare"));
		col.add(new Person("Mike"));
	}
	
	private static void showElements(Collection<Person> col) {
		for (Person element: col) {
			System.out.println(element);
		}
	}
}

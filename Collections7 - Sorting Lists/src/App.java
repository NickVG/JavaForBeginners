import java.util.*;


class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
		//return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}
class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1>len2) {
			return 1;
		} else if (len1<len2) {
			return -1;
		}
		return 0;
	}
	
}

class AlphabeticalComparator implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
}

class ReverseAlphabeticalComparator implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}
}

public class App {

	public static void main(String[] args) {
		///////////////Sorting Strings/////////////////
		List<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("elephant");
		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");
		animals.add("mongoose");
		
		Collections.sort(animals, new StringLengthComparator());
		Collections.sort(animals, new AlphabeticalComparator());
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		System.out.println();
///////////////Sorting Numbers/////////////////
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(32);
		numbers.add(43);
		numbers.add(63);
		numbers.add(323);
		numbers.add(0);
	
		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}
		});
		
		for(Integer number: numbers) {
			System.out.println(number);
		}
		
		System.out.println();
	
///////////////Sorting Objects?/////////////////
		
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person(1, "Joe"));
		people.add(new Person(3, "Bob"));
		people.add(new Person(2, "Ann"));
		people.add(new Person(6, "Nick"));
		people.add(new Person(112, "Sue"));
		
		Collections.sort(people, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {

                if(p1.getId() > p2.getId()) {
                    return 1;
                }
                else if(p1.getId() < p2.getId()) {
                    return -1;
                }
                
                return 0;
			}
		});
		
		for(Person person: people) {
			System.out.println(person);
		}
	}
}


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects...");
		
		Person[] people = {new Person(1, "Sue"), new Person(99, "Mike"), new Person(7, "Bob")};
		
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		
		try(FileOutputStream fs = new FileOutputStream("test.ser")) {
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(people);
			
			os.writeObject(peopleList);
			
			os.writeInt(peopleList.size());
			for(Person person: peopleList) {
				os.writeObject(person);
			}
			

			
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

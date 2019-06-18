import java.io.*;
import java.util.*;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading objects...");
		
		try(FileInputStream fi = new FileInputStream("test.ser")) {
			ObjectInputStream os = new ObjectInputStream(fi);
				
			Person[] people = (Person[])os.readObject();
			
			ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
			
			for(Person person: peopleList) {
				System.out.println(person);
			}
			
			int num = os.readInt();
			
			for(int i = 0; i<num; i++) {
				Person person = (Person)os.readObject();
				System.out.println(person);
			}
			os.close();
		} catch(FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("File is busy");
		} catch(ClassNotFoundException e) {
			
		}
	}

}

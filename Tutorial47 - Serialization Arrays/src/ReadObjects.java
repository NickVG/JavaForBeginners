import java.io.*;
import java.util.*;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading objects...");
		
		try(FileInputStream fi = new FileInputStream("test.ser")) {
			ObjectInputStream os = new ObjectInputStream(fi);
				
			Person[] person = (Person[])os.readObject();
			System.out.println(person.toString());

		} catch(FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("File is busy");
		} catch(ClassNotFoundException e) {
			
		}
	}

}

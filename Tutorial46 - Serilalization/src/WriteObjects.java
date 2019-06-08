import java.io.*;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writinng objects... ");
		
		Person mike = new Person(543, "Mike");
		Person sue = new Person(123, "Sue");
		
		System.out.println(mike);
		System.out.println(sue);
		
		
		try(FileOutputStream sf = new FileOutputStream("people.bin")) {
			ObjectOutputStream os = new ObjectOutputStream(sf);
			os.writeObject(mike);
			os.writeObject(sue);
			os.close( );
		} catch (FileNotFoundException e) {
			System.out.println("Can not find file");
		} catch (IOException e) {
			System.out.println("Can not write to a file");
		}
	}

}

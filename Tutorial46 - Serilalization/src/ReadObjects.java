import java.io.*;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading objects... ");

		try(FileInputStream fi = new FileInputStream("people.bin")) {
			ObjectInputStream os = new ObjectInputStream(fi);
			
			Person person1 = (Person)os.readObject();
			Person person2 = (Person)os.readObject();
			
			os.close();
			
			System.out.println(person1);
			System.out.println(person2);
		} catch(FileNotFoundException e) {
			System.out.println("File not found...");
		} catch(IOException e) {
			System.out.println("File can not be opened...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

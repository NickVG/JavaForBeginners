import java.io.*;

public class App {

	public static void main(String[] args) {
		File file = new File("test.txt");
		
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			br.write("this is first line");
			br.newLine();
			br.write("this is second line");
			br.newLine();
			br.write("this is third line");
		} catch (IOException e) {
			System.out.println("Unable to write file " + file.toString());
		}

	}

}

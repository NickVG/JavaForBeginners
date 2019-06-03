package demo2;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		
		FileReader fr =  new FileReader(file);
	}

}

package demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		
		try {
			FileReader fr =  new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("File " + file.toString() + " Not Found");
		}
		
		System.out.println("Finished.");

	}

}

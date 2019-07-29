package reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RevertFile {
	String fileName;
	File file = new File(fileName);

	StringBuilder sb1 = new StringBuilder();

	RevertFile(String fileName) {
		file = new File(fileName);
	}

	{
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = new String();
			RevertString rS = new RevertString(line);

			while ((line = br.readLine()) != null) {
				sb1.append(rS.revertString()).append(System.lineSeparator());
			}

		} catch (FileNotFoundException e) {
			System.out.println("Can't find file " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
		}
	}
	{
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			br.write(new String(sb1));
		} catch (IOException e) {
			System.out.println("Unable to write file " + file.toString());
		}
	}
	
	public StringBuilder getSb1(){
		return sb1;
	}

}

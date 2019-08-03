import java.io.*;

/**
@author
Nikolay Gorbunov
version 0.1
App for reverting chars in txt files on Windows Systems
*/


public class Reverter {

	public static void main(String[] args) {
//		System.out.print(new String((new DataReciever("C:\\test.txt").dataToChange())));
		new DataReciever("C:\\test.txt").fileReverted();

	}

}

class DataReciever {
	String fileName;
	int count;

	/**
	 * constructor of the class
	 * @param fileName isa path to the file need to be reverted
	 */
	DataReciever(String fileName) {
		this.fileName = fileName;
	}

	StringBuilder data = new StringBuilder("");
	StringBuilder result = new StringBuilder("");

/**
 * 
 * @return reverted StringBuilder object received from class constructor
 */
	StringBuilder dataToChange() {
		try (BufferedReader br = new BufferedReader(new FileReader(new File(fileName)))) {
			String line;
			while ((line = br.readLine()) != null) {
//				data.append(line).append(System.lineSeparator()); ??? Почему-то работает неправильно
				data.append(line).append('\n');
			}
			data.deleteCharAt(data.length() - 1);
			br.close();

		} catch (FileNotFoundException e1) {
			System.out.println("File not found");
		} catch (NullPointerException e) {
			System.out.println("Не введено имя файла");
		} catch (IOException e) {
			System.out.println("Файл занят.");
		}

		for (int i = data.length(); i > 0; i--) {
			this.result.append(data.charAt(i - 1));
		}

		return this.result;

	}
/**
 * Void method responsible for writing data to file
 */
	void fileReverted() {
		dataToChange();
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("test1.txt")))) {
			String out = new String(result);
			System.out.println(out);
			bw.write(new String(out));
		} catch (IOException e) {
			System.out.println("Не могу прочитать файл " + "test1.txt");
		}
	}
}

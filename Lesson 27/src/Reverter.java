import java.io.*;

public class Reverter {

	public static void main(String[] args) {
		String  filePath= "C:\\test.txt";
//		DataReciever data = new DataReciever();
//		data.setFileName(filePath);
//		StringBuilder source = data.dataToChange(filePath);
//		System.out.println(new String(source));
//		System.out.println();
//		data.dataToChange(filePath);
//		StringBuilder reverted = new StringBuilder("");
//		for(int i = source.length(); i > 0; i--) {
//			reverted.append(source.charAt(i-1));
//		}
//		System.out.println(new String(source));
		System.out.print(new String((new DataReciever("C:\\test.txt").dataToChange())));

	}

}

class DataReciever {
	String fileName;
	int count;
//	void setFileName(String fileName){
//		this.fileName = fileName;
//	}
	DataReciever(String fileName){
		this.fileName = fileName;
	}
	StringBuilder data = new StringBuilder("");
	StringBuilder result = new StringBuilder("");
	
	StringBuilder dataToChange(){
		try (BufferedReader br = new BufferedReader(new FileReader(new File(fileName)))) {
			String line;
			while ((line = br.readLine()) != null) {
				data.append(line).append(System.lineSeparator());
			}
			data.deleteCharAt(data.length() - 1);
			System.out.print(new String(data));
			br.close();
		
		} catch (FileNotFoundException e1) {
			System.out.println("File not found");
		} catch (NullPointerException e) {
			System.out.println("Не введено имя файла");
		}
		catch (IOException e) {
			System.out.println("Файл занят.");
		}
		
		for(int i = data.length(); i > 0; i--) {
			result.append(data.charAt(i-1));
		}
		
		return result;

	}
	
}

class DataWriter{
	String fileName;
	int count;
	DataWriter(String fileName, int count){
		this.fileName = fileName;
		this.count = count;
	}
	
    File file = new File(fileName);
    FileOutputStream fileOutputStream = new FileOutputStream(file);

    String greetings = new String((new DataReciever("C:\\test.txt").dataToChange()));
    
    fileOutputStream.write(greetings.getBytes());

//	fileOutputStream.write(greetings.getBytes());

//	fileOutputStream.close();
    
	/*
	try (BufferedWriter wr = new BufferedWriter(new FileWriter(new File(fileName)))) {
		String line;
		while ((line = wr.readLine()) != null) {
			data.append(line).append(System.lineSeparator());
		}
		data.deleteCharAt(data.length() - 1);
		System.out.print(new String(data));
		br.close();
	
	} catch (FileNotFoundException e1) {
		System.out.println("File not found");
	} catch (NullPointerException e) {
		System.out.println("Не введено имя файла");
	}
	catch (IOException e) {
		System.out.println("Файл занят.");
	}
	*/
}
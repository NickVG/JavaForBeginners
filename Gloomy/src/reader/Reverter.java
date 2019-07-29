package reader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Reverter {

	public static void main(String[] args) {
	RevertFile rF = new RevertFile("File.txt");
	System.out.println(rF.getSb1());

	}

}
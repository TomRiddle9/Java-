package com.mfg.beginner;
import java.io.*;

public class TestMap{
	public static void main(String[] args) throws IOException{
		
		File my_file = new File("C:\\Users\\hp\\Desktop\\file1.txt");
		int ch;
		if(my_file.canRead()) {
			System.out.println("It is readble");
		}
		else
			System.out.println("It is not readble");
		try {
		FileReader fr = new FileReader(my_file);
		while((ch = fr.read())!= -1) {
			System.out.print((char)ch);
		}
		}
		catch(IOException e) {
			e.getStackTrace();
			System.out.println("Exception Handled");
			System.out.println("Okay now");
		}
	}
}
package com.mfg.beginner;

import java.util.*;
import java.io.*;

public class Normal{
	
	static void modifier(String old_string, String new_string) throws IOException {
		File file_mod = new File("C:\\Users\\hp\\Desktop\\file1.txt");
		String old_content = " ";
		BufferedReader reader = null;
		FileWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader(file_mod));
			String line = reader.readLine();
			while(line != null) {
				old_content = old_content + line + System.lineSeparator();
				line = reader.readLine();
			}
			String new_content = old_content.replaceAll(old_string, new_string);
			writer = new FileWriter(file_mod);
			writer.write(new_content);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			reader.close();
			writer.close();
		}
	}
	
	public static void main(String[] args) throws IOException {
		modifier("I am a noob coder", "I am a pro coder");
	}
}
	
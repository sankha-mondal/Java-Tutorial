package com.fileHandeling;

import java.io.FileOutputStream;
import java.io.IOException;

public class Try_With_Resources {
	public static void main(String[] args) {

		String filepath = "F://java Project//Exception Handeling//New_File.txt";
		
		try(FileOutputStream fos = new FileOutputStream(filepath)) {
			
			String content = "Welcome to try-with-resources";
			fos.write(content.getBytes());
			
			System.out.println("Content written to file successfully");
		}
		catch (IOException e) {
			System.out.println("Errpr Occured: " + e);
		}
	}

}

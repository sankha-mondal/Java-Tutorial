package com.try_catch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Implement_of_Throws {
	public static void main(String[] args) throws IOException {
		FileReader file = null;
		BufferedReader fileInput = null;
		
		try {
			file = new FileReader("F:\\java Project\\Exception Handeling\\source.txt");
			fileInput = new BufferedReader(file);
			
			for(int i=0; i<3; i++) {
				System.out.println(fileInput.readLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally {
				file.close(); 
				fileInput.close(); 	
		}
		
		
	}
}

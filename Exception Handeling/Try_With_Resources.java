package com.fileHandeling;

import java.io.FileOutputStream;
import java.io.IOException;

public class Try_With_Resources {
	public static void main(String[] args) {

		String filepath = "F://java Project//Exception Handeling//New_File.txt";
		
		try(FileOutputStream fos = new FileOutputStream(filepath)) {
			
			String content = "Welcome to try-with-resources";      // Content that you want to put inside the New_File.
			fos.write(content.getBytes());   //  getBytes() helps to convert String into byte format.
			
			System.out.println("Content written to file successfully");
		}
		catch (IOException e) {
			System.out.println("Errpr Occured: " + e);
		}

    /*   1) Passes the responsibilty of closing down of resources to java.
           2) Developer can focus on code logic not in plumbing code.   */




	}
}
